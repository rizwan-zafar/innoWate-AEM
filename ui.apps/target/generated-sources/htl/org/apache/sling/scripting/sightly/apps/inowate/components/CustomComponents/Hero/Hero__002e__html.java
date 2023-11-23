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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.Hero;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Hero__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write(" <main id=\"main\">\n<section id=\"hero\" class=\"hero\">\n\n      <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "bgImage");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\" data-aos=\"fade-in\"/>\n\n      <div class=\"container\">\n        <div class=\"row\">\n          <div class=\"col-lg-10\">\n            <h2 data-aos=\"fade-up\" data-aos-delay=\"100\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "welcome"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h2>\n            <p data-aos=\"fade-up\" data-aos-delay=\"200\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\n          </div>\n          <div class=\"col-lg-5\">\n            <form action=\"#\" class=\"sign-up-form d-flex\" data-aos=\"fade-up\" data-aos-delay=\"300\">\n              <input type=\"text\" class=\"form-control\" placeholder=\"Enter email address\"/>\n              <input type=\"submit\" class=\"btn btn-primary\"");
{
    Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "btnText");
    {
        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "attribute");
        {
            boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
            if (var_shoulddisplayattr9) {
                out.write(" value");
                {
                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                    if (!var_istrueattr8) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n            </form>\n          </div>\n        </div>\n      </div>\n\n    </section><!-- End Hero Section -->\n</main>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

