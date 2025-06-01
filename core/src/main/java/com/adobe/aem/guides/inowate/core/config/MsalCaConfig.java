package com.adobe.aem.guides.inowate.core.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration(
        label = "Inowate -  Context Aware Configuration for MSAL",
        description = "Context Aware Configuration for Inowate AEM Project"
)
public @interface MsalCaConfig {

    @Property(label = "Configuration Name", description = "Name of the configuration context")
    String configName() default "configName:";

    @Property(label = "Entra ID", description = "Unique identifier for the application")
    String entraID() default "entraID:";

    @Property(label = "Authority", description = "Authorization server or token issuer URL")
    String authority() default "authority:";
}
