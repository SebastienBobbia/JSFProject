package com.formation.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CustomValidationView {
     
    private String text;
     
  
    private String email;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
     
     
}
