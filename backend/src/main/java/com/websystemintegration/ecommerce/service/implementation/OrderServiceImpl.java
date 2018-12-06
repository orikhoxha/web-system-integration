package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.*;
import com.websystemintegration.ecommerce.repository.CartItemRepository;
import com.websystemintegration.ecommerce.repository.OrderRepository;
import com.websystemintegration.ecommerce.repository.PaymentRepository;
import com.websystemintegration.ecommerce.repository.ShippingRepository;
import com.websystemintegration.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CartItemRepository cartItemRepository;

    @Override
    @Transactional
    public Order save(Order order, List<CartItem> cartItemList) {
        for(CartItem cartItem : cartItemList){
            cartItem.setOrder(order);
            cartItemRepository.save(cartItem);
        }
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getUserOrders(User user) {
        return orderRepository.findOrdersByUser(user);
    }
}
