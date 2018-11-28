package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
