package com.devet.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
   @Id
   private String id;
   private String name;
   private String price;
   private String quantity;
  
   
   
   public Product() {
   }
   
   public Product(String id, String name, String price) {
      this.id = id;
      this.name = name;
      this.price = price;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public String getPrice() {
      return price;
   }
   
   public void setPrice(String price) {
      this.price = price;
   }
   
   public String getQuantity() {
      return quantity;
   }
   
   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }
}
