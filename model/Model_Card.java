
package model;

import javax.swing.Icon;


public class Model_Card {
    private Icon icon;
    private String title;
    private String description;
    private String values;

    
    public Icon getIcon() {
        return icon;
    }

    
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getValues() {
        return values;
    }
    
    public String getTitle() {
        return title;
    }

    public void setValues(String values) {
        this.values = values;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getDescription() {
        return description;
    }

    public Model_Card(Icon icon, String title, String values, String description){
    this.icon=icon;
    this.description=description;
    this.title=title;
    this.values=values;
    }
    
    public Model_Card(){
    
    }
    public void setDescription(String description) {
        this.description = description;
    }
          
    
}
