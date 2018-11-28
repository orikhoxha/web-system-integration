package com.websystemintegration.ecommerce.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class CartItem implements Serializable {

    private static final long serialVersionUID = -189412481L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long quantity;

    @OneToOne
    private Item item;

    @OneToMany(mappedBy = "cartItem")
    @JsonIgnore
    private List<ItemToCartItem> itemToCartItemList;

    @ManyToOne
    @JoinColumn(name="shopping_cart_id")
    @JsonIgnore
    private ShoppingCart shoppingCart;

    @ManyToOne
    @JoinColumn(name="order_id")
    @JsonIgnore
    private Order order;

    public CartItem(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<ItemToCartItem> getItemToCartItemList() {
        return itemToCartItemList;
    }

    public void setItemToCartItemList(List<ItemToCartItem> itemToCartItemList) {
        this.itemToCartItemList = itemToCartItemList;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "quantity=" + quantity +
                ", item=" + item +
                ", itemToCartItemList=" + itemToCartItemList +
                ", shoppingCart=" + shoppingCart +
                ", order=" + order +
                '}';
    }
}
