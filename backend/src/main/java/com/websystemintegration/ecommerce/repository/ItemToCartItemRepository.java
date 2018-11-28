package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.CartItem;
import com.websystemintegration.ecommerce.domain.ItemToCartItem;
import org.springframework.data.repository.CrudRepository;

public interface ItemToCartItemRepository extends CrudRepository<ItemToCartItem, Long> {
    void deleteByCartItem(CartItem cartItem);
}
