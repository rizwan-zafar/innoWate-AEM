package com.adobe.aem.guides.inowate.core.models;


import com.adobe.aem.guides.inowate.core.config.MsalCaConfig;
import org.apache.sling.caconfig.ConfigurationBuilder;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import java.util.*;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
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
    private String entraID;
    private String authority;



    @PostConstruct
    protected void init() {
        if (currentResource != null) {
            ConfigurationBuilder configBuilder = currentResource.adaptTo(ConfigurationBuilder.class);
            if (configBuilder != null) {
                MsalCaConfig caConfig = configBuilder.as(MsalCaConfig.class);
                if (caConfig != null) {
                    configName = caConfig.configName();
                    entraID = caConfig.entraID();
                    authority = caConfig.authority();
                    LOGGER.info("Loaded CAC: configName={}, entraID={}, authority={}", configName, entraID, authority);
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

    public String getEntraID() {
        return entraID;
    }

    public String getAuthority() {
        return authority;
    }

    
    
}
