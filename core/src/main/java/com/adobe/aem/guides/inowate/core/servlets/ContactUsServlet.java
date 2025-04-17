package com.adobe.aem.guides.inowate.core.servlets;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;

import org.osgi.service.component.annotations.Component;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;


@Component(service = Servlet.class,
    property = {
        "sling.servlet.methods=" + HttpConstants.METHOD_POST,
        "sling.servlet.paths=" + "/bin/contact-us"
    })
public class ContactUsServlet extends SlingAllMethodsServlet {
    private static final Logger log = LoggerFactory.getLogger(ContactUsServlet.class);

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

        response.setContentType("application/json");
        response.getWriter().write(jsonResponse);
    }
}

