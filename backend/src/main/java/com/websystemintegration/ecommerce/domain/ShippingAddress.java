package com.websystemintegration.ecommerce.domain;

import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ShippingAddress implements Serializable {

    private static final long serialVersionUID = 189013457L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String shippingAddressName;
    private String shippingAddressStreet1;
    private String shippingAddressCity;
    private String shippingAddressState;
    private String shippingAddressZipcode;

    @Type(type="text")
        private String instructions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShippingAddressName() {
        return shippingAddressName;
    }

    public void setShippingAddressName(String shippingAddressName) {
        this.shippingAddressName = shippingAddressName;
    }

    public String getShippingAddressStreet1() {
        return shippingAddressStreet1;
    }

    public void setShippingAddressStreet1(String shippingAddressStreet1) {
        this.shippingAddressStreet1 = shippingAddressStreet1;
    }

    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    public void setShippingAddressCity(String shippingAddressCity) {
        this.shippingAddressCity = shippingAddressCity;
    }

    public String getShippingAddressState() {
        return shippingAddressState;
    }

    public void setShippingAddressState(String shippingAddressState) {
        this.shippingAddressState = shippingAddressState;
    }

    public String getShippingAddressZipcode() {
        return shippingAddressZipcode;
    }

    public void setShippingAddressZipcode(String shippingAddressZipcode) {
        this.shippingAddressZipcode = shippingAddressZipcode;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "shippingAddressName='" + shippingAddressName + '\'' +
                ", shippingAddressStreet1='" + shippingAddressStreet1 + '\'' +
                ", shippingAddressCity='" + shippingAddressCity + '\'' +
                ", shippingAddressState='" + shippingAddressState + '\'' +
                ", shippingAddressZipcode='" + shippingAddressZipcode + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}