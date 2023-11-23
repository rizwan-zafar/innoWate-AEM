package com.adobe.aem.guides.inowate.core.models;

import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.models.annotations.Model;
 import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.osgi.service.component.annotations.Reference;
import java.util.*;
import java.util.Iterator;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import com.day.cq.wcm.api.Page;

@Model(adaptables = { SlingHttpServletRequest.class,
        Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ChildPagesModel {

    @Reference
    private ResourceResolverFactory resourceResolverFactory;

    @SlingObject
    private Resource resource;

    @ValueMapValue
    String rootPath;

    public Iterator<Page> getCurrentPage() {
        Iterator<Page> childPages = null;
        String specificPagePath = rootPath;
        Resource specificPageResource = resource.getResourceResolver().getResource(specificPagePath);
        if (specificPageResource != null) {
            Page specificPage = specificPageResource.adaptTo(Page.class);
            if (specificPage != null) {
                childPages = specificPage.listChildren();
            }
        }
        return childPages;
    }

}