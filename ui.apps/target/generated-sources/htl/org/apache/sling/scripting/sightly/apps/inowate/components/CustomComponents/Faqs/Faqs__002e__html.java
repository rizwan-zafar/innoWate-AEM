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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.Faqs;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Faqs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar2_list_coerced$ = null;
out.write(" <!-- Faq Section - Home Page -->\n    ");
_global_obj = renderContext.call("use", com.adobe.aem.guides.inowate.core.models.FaqsModel.class.getName(), obj());
out.write("<section id=\"faq\" class=\"faq\">\n\n\n\n<div class=\"container\">\n\n        <div class=\"row gy-4\">\n\n          <div class=\"col-lg-4\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n            <div class=\"content px-xl-5\">\n              <h3><strong>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</strong></h3>\n              <p>");
{
    String var_1 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text"))) + "\n               ");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n            </div>\n          </div>\n\n          <div class=\"col-lg-8\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n\n            ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_obj, "getFaqsSet");
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
                            out.write("<div class=\"faq-container\">");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object item : var_collectionvar2_list_coerced$) {
                                {
                                    long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index9, 1)).longValue());
                                    {
                                        boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                        if (var_traversal11) {
                                            out.write("\n\n\n              <div class=\"faq-item\">\n                <h3><span class=\"num\">");
                                            {
                                                String var_12 = (renderContext.getObjectModel().toString(renderContext.call("xss", itemlist_field$_count, "text")) + ".");
                                                out.write(renderContext.getObjectModel().toString(var_12));
                                            }
                                            out.write("</span> <span>");
                                            {
                                                Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "question"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_13));
                                            }
                                            out.write("</span></h3>\n                <div class=\"faq-content\">\n                  <p>");
                                            {
                                                Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "answer"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_14));
                                            }
                                            out.write("</p>\n                </div>\n                <i class=\"faq-toggle\"> < </i>\n              </div><!-- End Faq item-->\n\n\n\n            ");
                                        }
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
out.write("\n\n          </div>\n        </div>\n\n      </div>\n\n\n    </section><!-- End Faq Section -->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

