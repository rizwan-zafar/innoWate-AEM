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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.Footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar2_list_coerced$ = null;
Collection var_collectionvar17_list_coerced$ = null;
out.write("  <!-- ======= Footer ======= -->\n  ");
_global_obj = renderContext.call("use", com.adobe.aem.guides.inowate.core.models.FooterModel.class.getName(), obj());
out.write("<footer id=\"footer\" class=\"footer\">\n\n    <div class=\"container footer-top\">\n      <div class=\"row gy-4\">\n        <div class=\"col-lg-5 col-md-12 footer-about\">\n          <a href=\"index.html\" class=\"logo d-flex align-items-center\">\n            <h2><strong>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</strong></h2>\n          </a>\n          <p>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n<div class=\"social-links d-flex mt-4\">\n\n\n          </div>\n        </div>\n\n        <div class=\"col-lg-2 col-6 footer-links\">\n          <h4>Useful Links</h4>\n          ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_obj, "getUsefullLink");
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
                            out.write("<ul>");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object item : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n            <li><a");
                                        {
                                            Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(item, "link");
                                            {
                                                Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
                                                {
                                                    boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                                                    if (var_shoulddisplayattr15) {
                                                        out.write(" href");
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
                                        out.write(">");
                                        {
                                            Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "label"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_16));
                                        }
                                        out.write("</a></li>\n          ");
                                    }
                                }
                                var_index9++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\n        </div>\n\n        <div class=\"col-lg-2 col-6 footer-links\">\n          <h4>Our Services</h4>\n          ");
{
    Object var_collectionvar17 = renderContext.getObjectModel().resolveProperty(_global_obj, "getServices");
    {
        long var_size18 = ((var_collectionvar17_list_coerced$ == null ? (var_collectionvar17_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar17)) : var_collectionvar17_list_coerced$).size());
        {
            boolean var_notempty19 = (var_size18 > 0);
            if (var_notempty19) {
                {
                    long var_end22 = var_size18;
                    {
                        boolean var_validstartstepend23 = (((0 < var_size18) && true) && (var_end22 > 0));
                        if (var_validstartstepend23) {
                            out.write("<ul>");
                            if (var_collectionvar17_list_coerced$ == null) {
                                var_collectionvar17_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar17);
                            }
                            long var_index24 = 0;
                            for (Object item : var_collectionvar17_list_coerced$) {
                                {
                                    boolean var_traversal26 = (((var_index24 >= 0) && (var_index24 <= var_end22)) && true);
                                    if (var_traversal26) {
                                        out.write("\n            <li><a");
                                        {
                                            Object var_attrvalue27 = renderContext.getObjectModel().resolveProperty(item, "link");
                                            {
                                                Object var_attrcontent28 = renderContext.call("xss", var_attrvalue27, "uri");
                                                {
                                                    boolean var_shoulddisplayattr30 = (((null != var_attrcontent28) && (!"".equals(var_attrcontent28))) && ((!"".equals(var_attrvalue27)) && (!((Object)false).equals(var_attrvalue27))));
                                                    if (var_shoulddisplayattr30) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr29 = (var_attrvalue27.equals(true));
                                                            if (!var_istrueattr29) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent28));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">");
                                        {
                                            Object var_31 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "label"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_31));
                                        }
                                        out.write("</a></li>\n          ");
                                    }
                                }
                                var_index24++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar17_list_coerced$ = null;
}
out.write("\n        </div>\n\n        <div class=\"col-lg-3 col-md-12 footer-contact text-center text-md-start\">\n          <h4>Contact Us</h4>\n          <p>");
{
    Object var_32 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "address"), "text");
    out.write(renderContext.getObjectModel().toString(var_32));
}
out.write("</p>\n          <p class=\"mt-4\"><strong>Phone:</strong> <span>");
{
    Object var_33 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "phone"), "text");
    out.write(renderContext.getObjectModel().toString(var_33));
}
out.write("</span></p>\n          <p><strong>Email:</strong> <span>");
{
    Object var_34 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "email"), "text");
    out.write(renderContext.getObjectModel().toString(var_34));
}
out.write("</span></p>\n        </div>\n\n      </div>\n    </div>\n\n    <div class=\"container copyright text-center mt-4\">\n      <p>&copy; <strong>");
{
    Object var_35 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "copyright"), "text");
    out.write(renderContext.getObjectModel().toString(var_35));
}
out.write("</strong></p>\n      <div class=\"credits\">\n        <!-- All the links in the footer should remain intact. -->\n        <!-- You can delete the links only if you've purchased the pro version. -->\n        <!-- Licensing information: https://bootstrapmade.com/license/ -->\n        <!-- Purchase the pro version with working PHP/AJAX contact form: [buy-url] -->\n        Designed by <a href=\"https://bootstrapmade.com/\">");
{
    Object var_36 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "madeby"), "text");
    out.write(renderContext.getObjectModel().toString(var_36));
}
out.write("</a>\n      </div>\n    </div>\n \n  </footer><!-- End Footer -->\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

