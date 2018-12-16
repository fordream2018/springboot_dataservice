package com.dream.dataservice.springboot_dataservice.bean;

import java.io.Serializable;

public class UserBean implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 3819751559353404216L;
    
    private String id;
    
    private String name;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
