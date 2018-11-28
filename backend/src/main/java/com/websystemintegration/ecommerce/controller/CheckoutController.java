package com.websystemintegration.ecommerce.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.websystemintegration.ecommerce.Config.ConstructMail;
import com.websystemintegration.ecommerce.domain.*;
import com.websystemintegration.ecommerce.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {



    private Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private ShippingService shippingService;


    @Autowired
    private ConstructMail constructMail;

    @Autowired
    private JavaMailSender mailSender;



    @PostMapping
    public Order checkoutPost(@RequestBody HashMap<String, Object> mapper){


        logger.info("getting in here");
        User u = userService.findOne(new Long(1));

        ObjectMapper objectMapper = new ObjectMapper();

        ShippingAddress shippingAddress = objectMapper.convertValue(mapper.get("shippingAddress"), ShippingAddress.class);
        ShoppingCart shoppingCart = objectMapper.convertValue(mapper.get("shoppingCart"), ShoppingCart.class);
        Payment payment = objectMapper.convertValue(mapper.get("payment"), Payment.class);
        List<CartItem> cartItemList = objectMapper.convertValue(mapper.get("cartItemList"), new TypeReference<List<CartItem>>(){});
        shoppingCart.setUser(u);
        //shoppingCart.setCartItemList(cartItemList);

       // logger.info("The shopping cart items: " + shoppingCart.getCartItemList());
        logger.info("The payment: " + payment);
        shippingAddress = shippingService.save(shippingAddress);
        String shippingDate = objectMapper.convertValue(mapper.get("shippingDate"), String.class);
        String shippingTime = objectMapper.convertValue(mapper.get("shippingTime"), String.class);


       // paymentService.save(payment);

        ShoppingCart newShoppingCart = shoppingCartService.save(shoppingCart);
        List<CartItem> newCartListCreated = cartItemService.save(newShoppingCart, cartItemList);

        Order order = new Order();
        /*order.setPayment(payment);*/
        order.setCartItemList(newCartListCreated);
        order.setOrderStatus("PROCESSING");
        order.setOrderDate(new Date());
        order.setShippingAddress(shippingAddress);
        order.setOrderTotal(shoppingCart.getTotal());
        order.setShippingDate(shippingDate);
        order.setShippingTime(shippingTime);
        order.setUser(u);
        Order newOrder = orderService.save(order, newCartListCreated);

        mailSender.send(constructMail.constructOrderConfirmationEmail(u, order, Locale.ENGLISH));

        shoppingCartService.clearShoppingCart(newShoppingCart);


        return newOrder;
    }
}
