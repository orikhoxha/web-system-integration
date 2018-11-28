package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.CartItem;
import com.websystemintegration.ecommerce.domain.ShoppingCart;
import com.websystemintegration.ecommerce.repository.ShoppingCartRepository;
import com.websystemintegration.ecommerce.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Autowired
    CartItemServiceImpl cartItemService;

    @Override
    public List<ShoppingCart> findAll() {
        return (List<ShoppingCart>) shoppingCartRepository.findAll();
    }

    @Override
    public ShoppingCart findOne(Long id) {
        return  shoppingCartRepository.findOne(id);
    }

    @Override
    public ShoppingCart save(ShoppingCart shoppingCart) {
        ShoppingCart shoppingCartNew = shoppingCartRepository.save(shoppingCart);
       return shoppingCartNew;
    }

    @Override
    public void clearShoppingCart(ShoppingCart shoppingCart) {
        List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);
        for(CartItem cartItem : cartItemList) {
            cartItem.setShoppingCart(null);
            cartItemService.save(cartItem);
        }
        shoppingCart.setTotal(new BigDecimal(0));
        shoppingCartRepository.save(shoppingCart);
    }
}
