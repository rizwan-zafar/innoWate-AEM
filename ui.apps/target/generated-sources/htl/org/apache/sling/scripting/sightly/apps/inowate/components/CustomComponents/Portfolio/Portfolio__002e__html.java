/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.Portfolio;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Portfolio__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar2_list_coerced$ = null;
out.write("<br/><br/><br/>\n<br/>");
_global_obj = renderContext.call("use", com.adobe.aem.guides.inowate.core.models.PortfolioModel.class.getName(), obj());
out.write("<section id=\"portfolio\" class=\"portfolio\">\n\n\n      <!--  Section Title -->\n      <div class=\"container section-title\" data-aos=\"fade-up\">\n        <h2>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\n        <p>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n      </div><!-- End Section Title -->\n\n      <div class=\"container\">\n\n        <div class=\"isotope-layout\" data-default-filter=\"*\" data-layout=\"packery\" data-sort=\"original-order\">\n\n          <ul class=\"portfolio-filters isotope-filters\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n          \t<li class=\"tab-button  filter-active\" data-category=\"all\">All</li>\n\t\t \t<li class=\"tab-button\" data-category=\"Website\">Website</li>\n            <li class=\"tab-button\" data-category=\"Web App\">Web App</li>\n            <li class=\"tab-button\" data-category=\"Mobile Apps\">Mobile App</li>\n\t\t\t<li class=\"tab-button\" data-category=\"Dashboard\">Dashboard</li>\n            <li class=\"tab-button\" data-category=\"UI/UX\">UI/UX</li>\n\n          </ul><!-- End Portfolio Filters -->\n\n          ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_obj, "getPortfolios");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            out.write("<div class=\"row gy-4 isotope-container item-list\" data-aos=\"fade-up\" data-aos-delay=\"700\">");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object port : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n\n            <div class=\"col-lg-4 col-md-6 portfolio-item isotope-item filter-app item\"");
                                        {
                                            Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(port, "getField_pp_catagory");
                                            {
                                                Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                                                    if (var_shoulddisplayattr15) {
                                                        out.write(" data-category");
                                                        {
                                                            boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                                                            if (!var_istrueattr14) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">\n              <img");
                                        {
                                            String var_attrcontent16 = ("https://admin.mayonity.com/" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(port, "getField_pp_image"), "uri")));
                                            out.write(" src=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent16));
                                            out.write("\"");
                                        }
                                        out.write(" class=\"img-fluid\" alt=\"\"/>\n              <div class=\"portfolio-info\">\n                <h4>");
                                        {
                                            Object var_17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(port, "getField_pp_clint"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_17));
                                        }
                                        out.write("</h4>\n                 <a");
                                        {
                                            Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(port, "getField_pp_project_link");
                                            {
                                                Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "uri");
                                                {
                                                    boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (!((Object)false).equals(var_attrvalue18))));
                                                    if (var_shoulddisplayattr21) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                                                            if (!var_istrueattr20) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" target=\"_blank\" title=\"More Details\" class=\"details-link\"><i class=\"bi bi-link-45deg\"></i></a>\n              </div>\n            </div>\n\n            <!-- End Portfolio Item -->\n\n\n\n\n\n\n\n\n\n\n          ");
                                    }
                                }
                                var_index9++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("<!-- End Portfolio Container -->\n\n        </div>\n\n      </div>\n\n    </section><!-- End Portfolio Section -->\n\n    <script>\ndocument.addEventListener('DOMContentLoaded', function () {\n    const tabButtons = document.querySelectorAll('.tab-button');\n    const itemList = document.querySelectorAll('.item');\n\n    tabButtons.forEach(button => {\n        button.addEventListener('click', function () {\n            const category = this.getAttribute('data-category');\n\n            itemList.forEach(item => {\n                const itemCategory = item.getAttribute('data-category');\n                if (category === 'all' || category === itemCategory) {\n                    item.style.display = ''; // Show matching items\n                } else {\n                    item.style.display = 'none'; // Hide non-matching items\n                }\n            });\n        });\n    });\n});\n\n    </script>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

