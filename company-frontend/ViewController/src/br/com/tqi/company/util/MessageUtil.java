package br.com.tqi.company.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUtil {
    
    public static void infoMessage(String message) {
        
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,
                        message,
                        message));
    }
    
    public static void errorMessage(String message) {
        
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        message,
                        message));
    }
    
    public static void warnMessage(String message) {
        
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,
                        message,
                        message));
    }
   
}
