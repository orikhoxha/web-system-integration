package com.websystemintegration.ecommerce;

import com.websystemintegration.ecommerce.domain.Order;
import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserPayment;
import com.websystemintegration.ecommerce.domain.UserShipping;
import com.websystemintegration.ecommerce.service.OrderService;
import com.websystemintegration.ecommerce.service.UserPaymentService;
import com.websystemintegration.ecommerce.service.UserService;
import com.websystemintegration.ecommerce.service.UserShippingService;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserService.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTestController {


    @LocalServerPort
    private int port;

    @Autowired
            UserService userService;
    @Autowired
            UserShippingService userShippingService;

    @Autowired
            UserPaymentService userPaymentService;

    @Autowired
    OrderService orderService;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    public void testRetrieveOrder() throws JSONException {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/api/users/1/orders/"),
                HttpMethod.GET, entity, String.class);

        String expected = "{id:1,total: 2, user: {id: 1, name:Orik Hoxha}," +
                "cartItemList: [{" +
                "   id:1, price: 3, descriptipn: Cocal cola]}";

        JSONAssert.assertEquals(expected, response.getBody(), false);

    }

    @PostMapping("/users/{id}/orders/")
    public ResponseEntity<Void> addOrder(@RequestBody Order order) {

        Order newUser = orderService.save(order);

        if (newUser == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(order.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Void> updateUser(
            @PathVariable User user) {

        User newUser = userService.save(user);

        if (newUser == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
    @PostMapping("/users/{id}/shipping/")
    public ResponseEntity<Void> addUserShipping(
            @PathVariable Long id, @RequestBody UserShipping userShipping) {

        UserShipping newUserShipping = userShippingService.save(userShipping);


        if (newUserShipping == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(userShipping.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/users/userId/shipping/{id}")
    public ResponseEntity<Void> updateUserShipping(@PathVariable Long userId,
           @RequestBody UserShipping userShipping, @PathVariable Long id) {

        UserShipping newUserShipping = userShippingService.save(userShipping);

        if (newUserShipping == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(userShipping.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("/users/{id}/payment/")
    public ResponseEntity<Void> addUserPayment(
            @PathVariable Long id, @RequestBody UserPayment userPayment) {

        UserPayment newUserPayment = userPaymentService.save(userPayment);


        if (newUserPayment == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(newUserPayment.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/users/userId/payment/{id}")
    public ResponseEntity<Void> updateUserPayment(@PathVariable Long userId,
                                                @RequestBody UserShipping userPayment, @PathVariable Long id) {

        UserShipping newUserPayment = userShippingService.save(userPayment);

        if (newUserPayment == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(userPayment.getId()).toUri();

        return ResponseEntity.created(location).build();
    }



    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }


}
