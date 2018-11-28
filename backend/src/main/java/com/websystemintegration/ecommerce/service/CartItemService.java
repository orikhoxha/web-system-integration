package com.websystemintegration.ecommerce.service;

import com.websystemintegration.ecommerce.domain.CartItem;
import com.websystemintegration.ecommerce.domain.Item;
import com.websystemintegration.ecommerce.domain.ShoppingCart;
import com.websystemintegration.ecommerce.domain.User;

import java.util.LinkedHashMap;
import java.util.List;

public interface CartItemService {

    CartItem addBookToCartItem(Item item, User user, int qty);

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    CartItem findById(Long id);

    List<CartItem> save(ShoppingCart shoppingCart, List<CartItem> cartItem);
}
