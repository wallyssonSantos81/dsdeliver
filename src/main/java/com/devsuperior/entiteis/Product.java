package com.devsuperior.entiteis;

public class Product {

   private Long id;
   private String name;
   private Double price;
   private String description;
   private String imgeUrl;

   public Product() {
   }

   public Product(Long id, String name, Double price, String description, String imgeUrl) {
       this.id = id;
       this.name = name;
       this.price = price;
       this.description = description;
       this.imgeUrl = imgeUrl;
   }


public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Double getPrice() {
    return price;
}
public void setPrice(Double price) {
    this.price = price;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public String getImgeUrl() {
    return imgeUrl;
}
public void setImgeUrl(String imgeUrl) {
    this.imgeUrl = imgeUrl;
}

@Override
public String toString() {
    return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + ", imgeUrl="
            + imgeUrl + "]";
}


}
