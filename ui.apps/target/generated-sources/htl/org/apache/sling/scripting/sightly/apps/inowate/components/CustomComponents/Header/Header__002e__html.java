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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.Header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Header__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Collection var_collectionvar0_list_coerced$ = null;
out.write("<meta charset=\"UTF-8\"/>\n\n<!-- ======= Header ======= -->\n  ");
_global_obj = renderContext.call("use", com.adobe.aem.guides.inowate.core.models.ChildPagesModel.class.getName(), obj());
out.write("<header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\n\n    <div class=\"container-fluid d-flex align-items-center justify-content-between\">\n\n      <a href=\"index.html\" class=\"logo d-flex align-items-center me-auto me-xl-0\">\n      <h1>Append</h1>\n      </a>\n\n\n      <!-- Nav Menu -->\n      <nav id=\"navmenu\" class=\"navmenu\">\n\n\n        ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_obj, "getCurrentPage");
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
                            out.write("<ul>");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object item : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n\n  \t\t  <li><a");
                                        {
                                            String var_attrcontent10 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "path"), "uri")) + ".html");
                                            out.write(" href=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_11));
                                        }
                                        out.write("</a></li>\n\n        ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n\n        <i class=\"mobile-nav-toggle d-xl-none bi bi-list\"></i>\n      </nav><!-- End Nav Menu -->\n\n      <a class=\"btn-getstarted\" href=\"#\">Get Started</a>\n\n    </div>\n  </header>\n \n  <!-- End Header -->\n    <!-- Scroll Top Button -->\n  <a href=\"#\" id=\"scroll-top\" class=\"scroll-top d-flex align-items-center justify-content-center\"><i class=\"bi\">\n\n    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"23\" height=\"23\" fill=\"currentColor\" class=\"bi bi-arrow-up\" viewBox=\"0 0 16 16\">\n      <path fill-rule=\"evenodd\" d=\"M8 15a.5.5 0 0 0 .5-.5V2.707l3.146 3.147a.5.5 0 0 0 .708-.708l-4-4a.5.5 0 0 0-.708 0l-4 4a.5.5 0 1 0 .708.708L7.5 2.707V14.5a.5.5 0 0 0 .5.5z\"/>\n    </svg>\n  </i></a>\n\n\n\n\n\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

