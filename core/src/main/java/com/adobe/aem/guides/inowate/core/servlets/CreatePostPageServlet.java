package com.adobe.aem.guides.inowate.core.servlets;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.PageManagerFactory;
import com.day.cq.replication.Replicator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.*;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.*;

import javax.jcr.Node;
import javax.servlet.Servlet;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

@Component(service = Servlet.class, property = {
        "sling.servlet.paths=/bin/create-post-pages",
        "sling.servlet.methods=GET"
})
public class CreatePostPageServlet extends SlingAllMethodsServlet {

    @Reference
    private PageManagerFactory pageManagerFactory;

    @Reference
    private ResourceResolverFactory resolverFactory;

    @Reference
    private Replicator replicator;

    private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";
    private static final String TEMPLATE_PATH = "/conf/inowate/settings/wcm/templates/main-page";
    private static final String PAGE_PARENT = "/content/inowate/language-masters/en/home/test1";
    private static final String COMPONENT_RESOURCE_TYPE = "inowate/components/CustomComponents/dynamic-post";

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) {
        try (ResourceResolver resolver = resolverFactory.getServiceResourceResolver(
                Map.of(ResourceResolverFactory.SUBSERVICE, "inowateuser"))) {

            PageManager pageManager = resolver.adaptTo(PageManager.class);

            JsonArray posts = JsonParser.parseReader(
                    new InputStreamReader(new URL(API_URL).openStream())).getAsJsonArray();

            for (JsonElement item : posts) {
                String title = item.getAsJsonObject().get("title").getAsString();
                String body = item.getAsJsonObject().get("body").getAsString();
                String pageName = title.toLowerCase().replaceAll("[^a-z0-9]+", "-");

                // Create AEM page
                Page newPage = pageManager.create(PAGE_PARENT, pageName, TEMPLATE_PATH, title);

                Node contentNode = newPage.adaptTo(Node.class).getNode("jcr:content");
                Node rootNode = contentNode.getNode("root");

                // ✅ Correct path to responsivegrid_1932985977 (as per your content.xml)
                Node containerNode = rootNode.getNode("responsivegrid_1932985977");

                String componentName = "dynamicpost-" + System.currentTimeMillis();
                Node componentNode = containerNode.addNode(componentName, "nt:unstructured");

                componentNode.setProperty("sling:resourceType", "inowate/components/CustomComponents/dynamic-post");
                componentNode.setProperty("title", title);
                componentNode.setProperty("body", body);
            }

            response.getWriter().write("Pages created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
