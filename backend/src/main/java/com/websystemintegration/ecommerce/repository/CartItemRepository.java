package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.CartItem;
import com.websystemintegration.ecommerce.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartItemRepository extends CrudRepository<CartItem, Long>{

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
