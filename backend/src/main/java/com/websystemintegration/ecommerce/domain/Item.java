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
    private int inStockNumber;

    @Column(columnDefinition = "text")
    private String details;

    @Column(columnDefinition = "text")
    private String ingredients;

    @Column(columnDefinition = "text")
    private String directions;

    @Column(columnDefinition = "text")
    private String warnings;



    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    private String shelve;

    private String type;

    private String brand;




    public Double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Double measurement) {
        this.measurement = measurement;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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


    public int getInStockNumber() {
        return inStockNumber;
    }

    public void setInStockNumber(int inStockNumber) {
        this.inStockNumber = inStockNumber;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getShelve() {
        return shelve;
    }

    public void setShelve(String shelve) {
        this.shelve = shelve;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                "description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", measurement=" + measurement +
                ", inStockNumber=" + inStockNumber +
                ", details='" + details + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", directions='" + directions + '\'' +
                ", warnings='" + warnings + '\'' +
                ", department=" + department +
                ", shelve='" + shelve + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
