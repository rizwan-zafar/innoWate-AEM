package com.adobe.aem.guides.inowate.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import com.adobe.aem.guides.inowate.core.models.TeamMembersModel;
import com.google.gson.Gson;
// @Component(service = { Servlet.class })
// @SlingServletResourceTypes(
//         resourceTypes="sling/servlet/default",
//         selectors = "myTest",
//         methods=HttpConstants.METHOD_GET,
//         extensions="json")
@Component(service = { Servlet.class }, property = {
    "sling.servlet.paths=/bin/myTest",
    "sling.servlet.methods=GET"
})
@ServiceDescription("Simple Demo Servlet")

public class GetTeamMembers extends SlingSafeMethodsServlet{
     
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse respons) throws IOException  {
       
        
        TeamMembersModel teamMembersModel= new TeamMembersModel();
        Gson gson = new Gson();
        String jsonResponse = gson.toJson(teamMembersModel.getTeamMember());
        respons.getWriter().write(jsonResponse);
    }

}
