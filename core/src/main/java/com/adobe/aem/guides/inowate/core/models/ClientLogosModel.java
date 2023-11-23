package com.adobe.aem.guides.inowate.core.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import java.io.IOException;
 
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import com.adobe.aem.guides.inowate.core.utilities.RequestHandler;
import com.fasterxml.jackson.core.JsonParseException;
 import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.adobe.aem.guides.inowate.core.utilities.GlobalConstants;
import com.adobe.aem.guides.inowate.core.utilities.ApisConstant;
import com.adobe.aem.guides.inowate.core.models.Beans.ClientLogosBean;
// Hasing
 

@Model(adaptables = { SlingHttpServletRequest.class,
    Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ClientLogosModel {
    
static RequestHandler requestHandler=new RequestHandler();



    public static ClientLogosBean[] getClientLogos() throws JsonParseException, JsonMappingException, IOException
    {
        String response=requestHandler.fetchRequestResponse(GlobalConstants.EXTERNAL_API_BASEURL,ApisConstant.FETCH_CLIENT_LOGOS);
        ObjectMapper objectMapper = new ObjectMapper();
        ClientLogosBean[] myObjects = objectMapper.readValue(response, ClientLogosBean[].class);
        
        return myObjects;
     }

    

}
