package com.adobe.aem.guides.inowate.core.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration(
        label = "Inowate - Context Aware Configuration",
        description = "Context Aware Configuration for Inowate AEM Project"
)
public @interface CAConfig {

    @Property(label = "Configuration Name", description = "Name of the configuration context")
    String configName() default "configName:";

    @Property(label = "Application ID", description = "Unique identifier for the application")
    String appID() default "appID:";

    @Property(label = "Authority", description = "Authorization server or token issuer URL")
    String authority() default "authority:";
}
