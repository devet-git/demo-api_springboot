package com.devet.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
   @Id
   private String id;
   private String fullName;
   private String username;
   private String password;
   public User() {
   }
   public User(String id, String fullName, String username, String password) {
      
      this.id = id;
      this.fullName = fullName;
      this.username = username;
      this.password = password;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   public String getFullname() {
      return fullName;
   }
   
   public void setFullname(String fullname) {
      this.fullName = fullname;
   }
   
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
}
