package com.adobe.aem.guides.inowate.core.models;


import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.osgi.service.component.annotations.Reference;
import java.util.*;
import java.util.Iterator;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import com.day.cq.wcm.api.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Model(adaptables = { SlingHttpServletRequest.class,
    Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(FooterModel.class);
  
    @ChildResource(name = "services")
    List<Resource> services;

    @ChildResource(name = "usefulllink")
    List<Resource> usefulllink;

    

    public List<Resource> getServices() {

        LOGGER.info("footer Service outside");
         // Log the values of faqsSet
         if (services != null) {
            for (Resource resource : services) {
                LOGGER.info("footer Service Path: {}", resource.getName());
                // You can log other properties or information from the Resource here as needed.
            }
        } else {
            LOGGER.info("footer Service is null");
        }
         return services;
    }


    public List<Resource> getUsefullLink() {

        LOGGER.info("footer getUsefullLink outside");
         // Log the values of faqsSet
         if (usefulllink != null) {
            for (Resource resource : usefulllink) {
                LOGGER.info("footer getUsefullLink Path: {}", resource.getName());
                // You can log other properties or information from the Resource here as needed.
            }
        } else {
            LOGGER.info("footer getUsefullLink is null");
        }
         return usefulllink;
    }
 
    
}
