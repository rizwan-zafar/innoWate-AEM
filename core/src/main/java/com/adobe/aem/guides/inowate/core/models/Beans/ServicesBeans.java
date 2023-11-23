package com.adobe.aem.guides.inowate.core.models.Beans;

 import com.fasterxml.jackson.annotation.JsonProperty;

public class ServicesBeans {
 
    @JsonProperty("icon")
    private String icon;

    @JsonProperty("heading")
    private String heading;

    @JsonProperty("description")
    private String description;



    //  GETER SETER FOR ICON
    public String getIcon()
    {
        return icon;
    }
    
    public void setIcon(String icon)
    {
        this.icon=icon;
    }


    // GETER SETER FOR HEADING
    public String getHeading()
    {
        return heading;
    }
    
    public void setHeading(String heading)
    {
        this.heading=heading;
    }

     // GETER SETER FOR Description
     public String getDescription()
     {
         return description;
     }
     
     public void setDescription(String description)
     {
         this.description=description;
     }




}
