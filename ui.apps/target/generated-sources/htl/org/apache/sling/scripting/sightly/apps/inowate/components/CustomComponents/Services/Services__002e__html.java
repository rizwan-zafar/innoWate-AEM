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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.Services;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Services__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar2_list_coerced$ = null;
out.write("<br/><br/><br/>\n<!-- Services Section - Home Page -->\n    ");
_global_obj = renderContext.call("use", com.adobe.aem.guides.inowate.core.models.ServicesModel.class.getName(), obj());
out.write("<section id=\"services\" class=\"services\">\n\n      <!--  Section Title -->\n      <div class=\"container section-title\" data-aos=\"fade-up\">\n        <h2>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\n        <p>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n      </div><!-- End Section Title -->\n\n      <div class=\"container\">\n\n        <div class=\"row gy-4\">\n\n        ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_obj, "getServices");
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
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object service : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n\n          <div class=\"col-lg-6 \" data-aos=\"fade-up\" data-aos-delay=\"100\">\n            <div class=\"service-item d-flex\">\n              <div class=\"icon flex-shrink\">\n               \n                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"60\" height=\"70\" fill=\"currentColor\" class=\"bi bi-0-circle\" viewBox=\"0 0 16 16\">\n                  <path d=\"M7.988 12.158c-1.851 0-2.941-1.57-2.941-3.99V7.84c0-2.408 1.101-3.996 2.965-3.996 1.857 0 2.935 1.57 2.935 3.996v.328c0 2.408-1.101 3.99-2.959 3.99ZM8 4.951c-1.008 0-1.629 1.09-1.629 2.895v.31c0 1.81.627 2.895 1.629 2.895s1.623-1.09 1.623-2.895v-.31c0-1.8-.621-2.895-1.623-2.895Z\"/>\n                  <path d=\"M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0ZM1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8Z\"/>\n              </svg>\n\n            </div>\n              <div>\n                <h4 class=\"title\"><a href=\"#\" class=\"stretched-link\">");
                                        {
                                            Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(service, "heading"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_12));
                                        }
                                        out.write("</a></h4>\n                <p class=\"description\">");
                                        {
                                            Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(service, "description"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_13));
                                        }
                                        out.write("</p>\n              </div>\n            </div>\n          </div>\n          <!-- End Service Item -->\n\n");
                                    }
                                }
                                var_index9++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\n\n\n\n        </div>\n\n      </div>\n\n    </section><!-- End Services Section -->\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

