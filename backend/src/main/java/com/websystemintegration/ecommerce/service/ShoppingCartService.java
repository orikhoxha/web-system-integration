package com.websystemintegration.ecommerce.service;

import com.websystemintegration.ecommerce.domain.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<ShoppingCart> findAll();

    ShoppingCart findOne(Long id);

    ShoppingCart save(ShoppingCart shoppingCart);

    void clearShoppingCart(ShoppingCart shoppingCart);
}
