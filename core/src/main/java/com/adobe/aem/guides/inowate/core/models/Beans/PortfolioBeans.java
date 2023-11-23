package com.adobe.aem.guides.inowate.core.models.Beans;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PortfolioBeans {
     private String field_pp_catagory;

     private String field_pp_clint;

     private String field_pp_image;


     private String field_pp_project_link;

     //  GETER SETER FOR field_pp_catagory
     public String getField_pp_catagory()
     {
         return field_pp_catagory;
     }
     
     public void setField_pp_catagory(String field_pp_catagory)
     {
         this.field_pp_catagory=field_pp_catagory;
     }

     
      //  GETER SETER FOR field_pp_clint
    public String getField_pp_clint()
    {
        return field_pp_clint;
    }
    
    public void setField_pp_clint(String field_pp_clint)
    {
        this.field_pp_clint=field_pp_clint;
    }


     //  GETER SETER FOR field_pp_image
     public String getField_pp_image()
     {
         return field_pp_image;
     }
     
     public void setField_pp_image(String field_pp_image)
     {
         this.field_pp_image=field_pp_image;
     }

     
      //  GETER SETER FOR field_pp_project_link
    public String getField_pp_project_link()
    {
        return field_pp_project_link;
    }
    
    public void setField_pp_project_link(String field_pp_project_link)
    {
        this.field_pp_project_link=field_pp_project_link;
    }


}
