
package com.adobe.aem.guides.inowate.core.models;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.http.HttpResponse;
 import org.apache.http.util.EntityUtils;
 import com.adobe.aem.guides.inowate.core.utilities.ApisConstant;
import com.adobe.aem.guides.inowate.core.utilities.GlobalConstants;
 import com.adobe.aem.guides.inowate.core.models.Beans.ServicesBeans;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
@Model(adaptables = { SlingHttpServletRequest.class,
        Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServicesModel {

    public static String fetthServicesCF() {
         try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            String fullPath=GlobalConstants.ENV_API_BASEURL+ApisConstant.FETCH_SERVICES_CF;
            HttpPost httpPost = new HttpPost(fullPath);

            // Set request headers
            httpPost.setHeader("Authorization", "Basic YWRtaW46YWRtaW4=");
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("Cookie", "cq-authoring-mode=TOUCH");
            // Set request body
            String requestBody = "{\"query\":\"{\\n  innowateServicesList(\\n      variation: \\\"en\\\"\\n  )\\n  {\\n    items {\\n        icon\\n        heading\\n        description\\n  }\\n}\\n}\",\"variables\":{}}";
            httpPost.setEntity(new StringEntity(requestBody));
            HttpResponse response = httpClient.execute(httpPost);
       
            if (response.getStatusLine().getStatusCode() == 200) {
                String responseData = EntityUtils.toString(response.getEntity());
                return responseData;
            } else {
                String errorMessage = "Error: " + response.getStatusLine().getStatusCode() + " "
                        + response.getStatusLine().getReasonPhrase();
                return errorMessage;
            }
        } catch (Exception e) {
            return "";
        }
    }

    public List<ServicesBeans>  getServices() {

        List<ServicesBeans> servicesList = new ArrayList<>();
        String jsonString =  fetthServicesCF();
        // Parsing the JSON string
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(jsonString).getAsJsonObject();
        // Accessing data
        JsonObject data = jsonObject.getAsJsonObject("data");
        JsonObject innowateServicesList = data.getAsJsonObject("innowateServicesList");
        JsonArray items = innowateServicesList.getAsJsonArray("items");
        for(int i=0;    i<items.size(); i++)
        {
            JsonObject item = items.get(i).getAsJsonObject();
            ServicesBeans services = new ServicesBeans();
            services.setIcon(item.get("icon").getAsString());
            services.setHeading(item.get("heading").getAsString());
            services.setDescription(item.get("description").getAsString());
            servicesList.add(services); // Store the ServicesBeans in the list
        }
        return servicesList;

     }

// public static void main(String[] args)
// {
//     for (ServicesBeans services : getServices()) {
        
//             System.out.println("Heading: " + services.getHeading());
//             System.out.println("Description: " + services.getDescription());
//         }
// }
     
}


