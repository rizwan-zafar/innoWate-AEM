package com.adobe.aem.guides.inowate.core.models;


import com.adobe.aem.guides.inowate.core.config.CAConfig;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.caconfig.ConfigurationBuilder;
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

import javax.annotation.PostConstruct;


@Model(adaptables = { SlingHttpServletRequest.class,
    Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TeamMembersModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(TeamMembersModel.class);

    @SlingObject
    private Resource currentResource;

    private String configName;
    private String appID;
    private String authority;



    @PostConstruct
    protected void init() {
        if (currentResource != null) {
            ConfigurationBuilder configBuilder = currentResource.adaptTo(ConfigurationBuilder.class);
            if (configBuilder != null) {
                CAConfig caConfig = configBuilder.as(CAConfig.class);
                if (caConfig != null) {
                    configName = caConfig.configName();
                    appID = caConfig.appID();
                    authority = caConfig.authority();
                    LOGGER.info("Loaded CAC: configName={}, appID={}, authority={}", configName, appID, authority);
                } else {
                    LOGGER.warn("CAConfig is null");
                }
            } else {
                LOGGER.warn("ConfigurationBuilder is null");
            }
        }
    }


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

    public String getConfigName() {
        return configName;
    }

    public String getAppID() {
        return appID;
    }

    public String getAuthority() {
        return authority;
    }

    
    
}
