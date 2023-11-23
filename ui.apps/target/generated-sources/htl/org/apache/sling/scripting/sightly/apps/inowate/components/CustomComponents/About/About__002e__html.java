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
package org.apache.sling.scripting.sightly.apps.inowate.components.CustomComponents.About;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class About__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<br/><br/><br/>\n <section id=\"about\" class=\"about\">\n\n      <div class=\"container\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n        <div class=\"row align-items-xl-center gy-5\">\n\n          <div class=\"col-xl-5 content\">\n            <h3>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "subHeading"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h3>\n            <h2>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h2>\n            <p>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n            <a href=\"#\" class=\"read-more\"><span>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "btnText"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</span> </a>\n          </div>\n\n          <div class=\"col-xl-7\">\n            <div class=\"row gy-4 icon-boxes\">\n\n              <div class=\"col-md-6\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n                <div class=\"icon-box\">\n                  <h3>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardOneTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h3>\n                  <p>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardOneDescription"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\n                </div>\n              </div> <!-- End Icon Box -->\n\n              <div class=\"col-md-6\" data-aos=\"fade-up\" data-aos-delay=\"300\">\n                <div class=\"icon-box\">\n\n                  <h3>");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardTwoTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</h3>\n                   <p>");
{
    Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardTwoDescription"), "text");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</p>\n                </div>\n              </div> <!-- End Icon Box -->\n\n              <div class=\"col-md-6\" data-aos=\"fade-up\" data-aos-delay=\"400\">\n                <div class=\"icon-box\">\n\n                  <h3>");
{
    Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardThreeTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</h3>\n                 <p>");
{
    Object var_9 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardThreeDescription"), "text");
    out.write(renderContext.getObjectModel().toString(var_9));
}
out.write("</p>\n                </div>\n              </div> <!-- End Icon Box -->\n\n              <div class=\"col-md-6\" data-aos=\"fade-up\" data-aos-delay=\"500\">\n                <div class=\"icon-box\">\n\n                  <h3>");
{
    Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardFourTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_10));
}
out.write("</h3>\n                <p>");
{
    Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "cardFourDescription"), "text");
    out.write(renderContext.getObjectModel().toString(var_11));
}
out.write("</p>\n                </div>\n              </div> <!-- End Icon Box -->\n\n            </div>\n          </div>\n\n        </div>\n      </div>\n\n    </section><!-- End About Section -->\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

