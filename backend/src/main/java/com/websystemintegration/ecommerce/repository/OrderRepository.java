package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.Order;
import com.websystemintegration.ecommerce.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findOrdersByUser(User user);
}
