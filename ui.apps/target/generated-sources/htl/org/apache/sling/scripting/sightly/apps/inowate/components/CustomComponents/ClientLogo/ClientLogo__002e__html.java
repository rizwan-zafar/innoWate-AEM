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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.ClientLogo;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class ClientLogo__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Collection var_collectionvar0_list_coerced$ = null;
out.write("<!-- Clients Section - Home Page -->\n    ");
_global_obj = renderContext.call("use", com.adobe.aem.guides.inowate.core.models.ClientLogosModel.class.getName(), obj());
out.write("<section id=\"clients\" class=\"clients\">\n\n      <div class=\"container-fluid\" data-aos=\"fade-up\">\n\n        ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_obj, "getClientLogos");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div class=\"row gy-4\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object logo : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n\n          <div class=\"col-xl-2 col-md-3 col-6 client-logo\">\n             <img");
                                        {
                                            String var_attrcontent10 = ("https://admin.mayonity.com/" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(logo, "getField_cl_image"), "uri")));
                                            out.write(" src=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                                            out.write("\"");
                                        }
                                        out.write(" class=\"img-fluid\" alt=\"\"/>\n          </div><!-- End Client Item -->\n\n\n\n\n        ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n\n      </div>\n\n    </section><!-- End Clients Section -->\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

