package com.adobe.aem.guides.inowate.core.servlets;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.resource.LoginException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component(service = Servlet.class,
           property = {
               "sling.servlet.methods=GET",
               "sling.servlet.paths=/bin/test-system-user"
           })
public class SystemUserTestServlet extends SlingAllMethodsServlet {

    @Reference
    private ResourceResolverFactory resolverFactory;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {

        Map<String, Object> authInfo = new HashMap<>();
        authInfo.put(ResourceResolverFactory.SUBSERVICE, "inowateuser");

        try (ResourceResolver resolver = resolverFactory.getServiceResourceResolver(authInfo)) {
            String userId = resolver.getUserID();
            response.getWriter().write("System user is working! Logged in as: " + userId);
        } catch (LoginException e) {
            response.getWriter().write("System user access failed: " + e.getMessage());
        }
    }
}
