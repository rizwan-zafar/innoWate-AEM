package com.adobe.aem.guides.inowate.core.servlets;

// Importing necessary classes for servlet and logging
import com.google.gson.Gson;
import org.apache.sling.api.resource.*;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.RepositoryException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Component(service = Servlet.class,
    property = {
        "sling.servlet.methods=" + HttpConstants.METHOD_POST,
        "sling.servlet.paths=" + "/bin/contact-us"
    })
public class ContactUsServlet extends SlingAllMethodsServlet {
    private static final Logger log = LoggerFactory.getLogger(ContactUsServlet.class);

    @Reference
    private ResourceResolverFactory resolverFactory;

    // The path where we will save the form data
    private static final String SUBMISSION_PATH = "/var/contact-us-submissions";

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("user-name");
        String email = request.getParameter("user-email");
        String message = request.getParameter("user-message");

        Map<String,String> data=new HashMap<>();
        data.put("name",name);
        data.put("email",email);
        data.put("message",message);
        String jsonResponse = new Gson().toJson(data);
        // You can log, send an email, or store the data in a JCR node or external DB
        log.info("Contact Us Submission: Name={}, Email={}, Message={}", name, email, message);

        try{
            Map<String,Object> authInfo=new HashMap<>();
            authInfo.put(ResourceResolverFactory.SUBSERVICE,"inowateuser");

            log.info("authInfooo", authInfo);
            
            try (ResourceResolver resolver=resolverFactory.getServiceResourceResolver(authInfo)){
                Resource parent = resolver.getResource(SUBMISSION_PATH);

                 // If parent path doesn’t exist, return error
                 if (parent == null) {
                    log.error("Parent path not found: {}", SUBMISSION_PATH);
                    response.setStatus(500);
                    return;
                }

                    // Creating a unique node name using UUID
                    String nodeName = "submission-" + UUID.randomUUID();

                    // Creating a map of properties to store in the new node
                    Map<String, Object> values = new HashMap<>();
                    values.put("jcr:primaryType", "nt:unstructured"); // ✅ this line fixes the error
                    values.put("name", name);
                    values.put("email", email);
                    values.put("message", message);
    
                    // Creating the new node under the parent path with the form data
                    Resource newNode = resolver.create(parent, nodeName, values);
    
                    // Committing the changes to the JCR repository
                    resolver.commit();
    
                    // Logging the saved path for debugging
                    log.info("Form data saved at: {}", newNode.getPath());
    


            }catch (LoginException | PersistenceException e) {
                // Handling login or saving errors
                log.error("Error saving contact form submission", e);
                response.setStatus(500);
            }

        }catch (Exception e) {
            // Catching any unexpected errors
            log.error("Unexpected error", e);
            response.setStatus(500);
        }


        response.setContentType("application/json");
        response.getWriter().write(jsonResponse);
    }
}

