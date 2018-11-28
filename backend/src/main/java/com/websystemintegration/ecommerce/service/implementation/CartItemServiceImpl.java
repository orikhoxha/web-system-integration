package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.controller.ItemController;
import com.websystemintegration.ecommerce.domain.*;
import com.websystemintegration.ecommerce.repository.CartItemRepository;
import com.websystemintegration.ecommerce.repository.ItemToCartItemRepository;
import com.websystemintegration.ecommerce.service.CartItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {

    private Logger logger = LoggerFactory.getLogger(ItemController.class);


    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    ItemToCartItemRepository itemToCartItemRepository;

    @Autowired
    ItemServiceImpl itemServiceImpl;

    @Autowired
    ShoppingCartServiceImpl shoppingCartService;


    @Override
    public CartItem addBookToCartItem(Item item, User user, int qty) {
        return null;
    }

    @Override
    public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
        return cartItemRepository.findByShoppingCart(shoppingCart);
    }

    @Override
    public CartItem updateCartItem(CartItem cartItem) {
        return null;
    }

    @Override
    public void removeCartItem(CartItem cartItem) {
        cartItemRepository.delete(cartItem);
    }

    @Override
    public CartItem findById(Long id) {
        return cartItemRepository.findOne(id);
    }


    public CartItem save(CartItem cartItem) {
        CartItem cartItemNew = cartItemRepository.save(cartItem);
        ItemToCartItem itemToCartItem = new ItemToCartItem();
        itemToCartItem.setItem(cartItemNew.getItem());
        itemToCartItem.setCartItem(cartItemNew);

        return cartItemNew;
    }

    @Override
    @Transactional
    public List<CartItem> save(ShoppingCart shoppingCart, List<CartItem> cartItems) {
        for(CartItem cartItem : cartItems){
            Item item = itemServiceImpl.findOne(cartItem.getItem().getId());
            cartItem.setItem(item);
            cartItem.setShoppingCart(shoppingCart);
            this.save(cartItem);
        }
        List<CartItem> cartItemsCreated = cartItemRepository.findByShoppingCart(shoppingCart);
        shoppingCart.setCartItemList(cartItemsCreated);
        shoppingCartService.save(shoppingCart);

        return cartItemsCreated;
    }
}
