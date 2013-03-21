package org.marcel.web.portlet.mavenprimefaceportlet;

import javax.faces.bean.ManagedBean;
/**
 * PortletTest Portlet Class
 */
@ManagedBean
public class PortletTest {
    private String name="Es geht!";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}