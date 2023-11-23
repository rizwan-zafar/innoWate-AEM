package com.adobe.aem.guides.inowate.core.models;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import java.util.ArrayList;
 

import javax.annotation.Resource;
import com.adobe.aem.guides.inowate.core.utilities.ApisConstant;
import com.adobe.aem.guides.inowate.core.utilities.GlobalConstants;
import com.adobe.aem.guides.inowate.core.utilities.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.adobe.aem.guides.inowate.core.models.Beans.PortfolioBeans;

@Model(adaptables = { SlingHttpServletRequest.class,
        Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PortfolioModel {

    @ValueMapValue
    String specific;

    public  String getSpecific() {
         
         return specific;
    }

    static RequestHandler requestHandler = new RequestHandler();

    public static PortfolioBeans[] fetchPortfolios() throws JsonMappingException, JsonProcessingException {
        String response = requestHandler.fetchRequestResponse(GlobalConstants.EXTERNAL_API_BASEURL,
                ApisConstant.FETCH_PORTFOLIO);
        ObjectMapper objectMapper = new ObjectMapper();
        PortfolioBeans[] myObjects = objectMapper.readValue(response, PortfolioBeans[].class);

        return myObjects;
    }

    public PortfolioBeans[] getPortfolios() throws JsonMappingException,
            JsonProcessingException {


        if (!"All".equals(getSpecific())) {
            
            PortfolioBeans[] portfolios = fetchPortfolios();
            ArrayList<PortfolioBeans> filteredPortfolio = new ArrayList<>();
           
            for (int i = 0; i < portfolios.length; i++) {
                String category=portfolios[i].getField_pp_catagory();
                 if (category.equals(getSpecific())) {
                      filteredPortfolio.add(portfolios[i]);    
               }
             }
            PortfolioBeans[] filteredArray = filteredPortfolio.toArray(new PortfolioBeans[filteredPortfolio.size()]);
            return filteredArray;
        } 
        else{
            return fetchPortfolios();
        }
    }

     

}
