package br.com.tqi.company.view;

import java.io.Serializable;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable {

   private static final long serialVersionUID = 8592811461376503649L;

   private String username;

   private String password;

   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public String login() {
       Map<String, Object> sessionMap = FacesContext.getCurrentInstance()
               .getExternalContext().getSessionMap();
       if ("usuarioA".equals(this.username) && "senhaA".equals(this.password)) {
           sessionMap.put("logged_in", true);
           sessionMap.put("search_permission", false);
           sessionMap.put("edit_permission", false);
           return "home";
       } else if ("usuarioB".equals(this.username)
               && "senhaB".equals(this.password)) {
           sessionMap.put("logged_in", true);
           sessionMap.put("search_permission", true);
           sessionMap.put("edit_permission", false);
           return "home";
       } else if ("usuarioC".equals(this.username)
               && "senhaC".equals(this.password)) {
           sessionMap.put("logged_in", true);
           sessionMap.put("search_permission", true);
           sessionMap.put("edit_permission", true);
           return "home";
       } else {
           FacesContext.getCurrentInstance().addMessage(
                   null,
                   new FacesMessage(FacesMessage.SEVERITY_ERROR,
                           "Usuário/senha inválidos",
                           "Usuário/senha inválidos"));
           return "login";
       }
   }
}