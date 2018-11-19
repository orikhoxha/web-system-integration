package com.websystemintegration.ecommerce.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "text")
    private String description;
    private String price;
    private Double measurement;

    @ManyToOne
    @JoinColumn(name="department_id")
    @JsonIgnore
    private Department shoppingCart;


    @Transient
    private MultipartFile itemImage;

    public Department getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Department shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Double getMeasurment() {
        return measurement;
    }

    public void setMeasurment(Double measurment) {
        this.measurement = measurment;
    }

    public MultipartFile getItemImage() {
        return itemImage;
    }

    public void setItemImage(MultipartFile itemImage) {
        this.itemImage = itemImage;
    }
}
