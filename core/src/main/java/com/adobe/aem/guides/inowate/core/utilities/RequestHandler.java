package com.adobe.aem.guides.inowate.core.utilities;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
 


public class RequestHandler {
    
    public String fetchRequestResponse(String BasePath,String costantApisUrl) {
        String fullPath = BasePath+costantApisUrl;
       
        // CALLING API WITH HEADERS
        try {
            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(fullPath);
            

            HttpResponse responsed = httpClient.execute(httpGet);
            if (responsed.getStatusLine().getStatusCode() == 200) {
                String responseData = EntityUtils.toString(responsed.getEntity());
                return responseData;
            } else {
                String errorMessage = "Error: " + responsed.getStatusLine().getStatusCode() + " "
                        + responsed.getStatusLine().getReasonPhrase();
                return "here is error";
            }
        } catch (Exception e) {
            return "catch error";
        }

    };
}



