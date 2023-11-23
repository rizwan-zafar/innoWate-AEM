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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.TeamMembers;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class TeamMembers__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_obj = null;
Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar2_list_coerced$ = null;
out.write("<br/><br/><br/>\n  <!-- Team Section - Home Page -->\n    ");
_global_obj = renderContext.call("use", com.adobe.aem.guides.inowate.core.models.TeamMembersModel.class.getName(), obj());
out.write("<section id=\"team\" class=\"team\">\n\n      <!--  Section Title -->\n      <div class=\"container section-title\" data-aos=\"fade-up\">\n        <h2>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\n        <p>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n      </div><!-- End Section Title -->\n\n      <div class=\"container\">\n\n        ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_obj, "getTeamMember");
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
                            out.write("<div class=\"row gy-5\">");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object item : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n\n\n\n\n\n\n          <div class=\"col-lg-4 col-md-6 member\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n            <div class=\"member-img\">\n              <img");
                                        {
                                            Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(item, "image");
                                            {
                                                Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
                                                {
                                                    boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                                                    if (var_shoulddisplayattr15) {
                                                        out.write(" src");
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
                                        out.write(" class=\"img-fluid\" alt=\"\"/>\n              <div class=\"social\">\n                 <a");
                                        {
                                            Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(item, "facebook");
                                            {
                                                Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "uri");
                                                {
                                                    boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
                                                    if (var_shoulddisplayattr19) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                                                            if (!var_istrueattr18) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">\n                 <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"25\" height=\"25\" fill=\"currentColor\" class=\"bi bi-facebook\" viewBox=\"0 0 16 16\">\n  <path d=\"M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z\"/>\n</svg>\n</a>\n                <a");
                                        {
                                            Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(item, "linkedin");
                                            {
                                                Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "uri");
                                                {
                                                    boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
                                                    if (var_shoulddisplayattr23) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr22 = (var_attrvalue20.equals(true));
                                                            if (!var_istrueattr22) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"22\" height=\"22\" fill=\"currentColor\" class=\"bi bi-linkedin\" viewBox=\"0 0 16 16\">\n  <path d=\"M0 1.146C0 .513.526 0 1.175 0h13.65C15.474 0 16 .513 16 1.146v13.708c0 .633-.526 1.146-1.175 1.146H1.175C.526 16 0 15.487 0 14.854V1.146zm4.943 12.248V6.169H2.542v7.225h2.401zm-1.2-8.212c.837 0 1.358-.554 1.358-1.248-.015-.709-.52-1.248-1.342-1.248-.822 0-1.359.54-1.359 1.248 0 .694.521 1.248 1.327 1.248h.016zm4.908 8.212V9.359c0-.216.016-.432.08-.586.173-.431.568-.878 1.232-.878.869 0 1.216.662 1.216 1.634v3.865h2.401V9.25c0-2.22-1.184-3.252-2.764-3.252-1.274 0-1.845.7-2.165 1.193v.025h-.016a5.54 5.54 0 0 1 .016-.025V6.169h-2.4c.03.678 0 7.225 0 7.225h2.4z\"/>\n</svg></a>\n              </div>\n            </div>\n            <div class=\"member-info text-center\">\n              <h4>");
                                        {
                                            Object var_24 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "member_name"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_24));
                                        }
                                        out.write("</h4>\n              <span>");
                                        {
                                            Object var_25 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "designation"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_25));
                                        }
                                        out.write("</span>\n              <p>");
                                        {
                                            Object var_26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "detail"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_26));
                                        }
                                        out.write("</p>\n            </div>\n          </div><!-- End Team Member -->\n\n\n\n\n\n\n\n\n        ");
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
out.write("\n\n      </div>\n\n    </section><!-- End Team Section -->\n</main>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

