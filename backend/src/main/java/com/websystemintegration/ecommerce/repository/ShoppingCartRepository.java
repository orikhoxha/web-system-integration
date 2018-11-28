package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;


public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
}
