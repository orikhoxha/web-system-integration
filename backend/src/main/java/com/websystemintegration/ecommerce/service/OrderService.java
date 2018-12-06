package com.websystemintegration.ecommerce.service;
import com.websystemintegration.ecommerce.domain.CartItem;
import com.websystemintegration.ecommerce.domain.Order;
import com.websystemintegration.ecommerce.domain.User;

import java.util.List;


public interface OrderService {
    Order save(Order order, List<CartItem> cartItemList);

    Order save(Order order);

    List<Order> getUserOrders(User user);

}
