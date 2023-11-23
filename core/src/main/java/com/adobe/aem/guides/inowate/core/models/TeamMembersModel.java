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
public class TeamMembersModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(TeamMembersModel.class);
  
    @ChildResource(name = "teamMember")
    List<Resource> teamMember;


    public List<Resource> getTeamMember() {

        LOGGER.info("teamMember outside");
         // Log the values of faqsSet
         if (teamMember != null) {
            for (Resource resource : teamMember) {
                LOGGER.info("teamMember Path: {}", resource.getName());
                // You can log other properties or information from the Resource here as needed.
            }
        } else {
            LOGGER.info("teamMember is null");
        }
         return teamMember;
    }

    
    
}
