package com.websystemintegration.ecommerce.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Department implements Serializable {
    private static final long serialVersionUID = -189415481L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
