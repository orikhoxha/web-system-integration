package com.websystemintegration.ecommerce.controller;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserPayment;
import com.websystemintegration.ecommerce.domain.UserShipping;
import com.websystemintegration.ecommerce.service.UserPaymentService;
import com.websystemintegration.ecommerce.service.UserService;
import com.websystemintegration.ecommerce.service.UserShippingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    @Autowired
    private UserPaymentService userPaymentService;

    @Autowired
    private UserShippingService userShippingService;

    @PostMapping(value = "/")
    public User addUser(@RequestBody User User) {
        return userService.save(User);
    }

    @GetMapping("/")
    public List<User> getUserList(){
        return userService.findAll();
    }

    @PutMapping(value = "/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {

        User theUser = userService.findOne(id);
        if(null == theUser){
            return null;
        }
        return userService.save(user);
    }

    @GetMapping(value = "/payments")
    public List<UserPayment> userPayments(){
        User user = userService.findOne(new Long(1));
        logger.info("User: " + user) ;
        return userPaymentService.findAll(user);
    }

    @PostMapping(value = "/payments")
    public void addUserPayment(@RequestBody UserPayment userPayment){
        User user = userService.findOne(new Long(1));
        userPayment.setUser(user);
        userPaymentService.save(userPayment);
    }

    @DeleteMapping(value = "/{userId}/payments/{paymentId}")
    public ResponseEntity<?> deleteUserPayment(@PathVariable Long userId, @PathVariable Long paymentId){
        userPaymentService.removeUserPayment(paymentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/shipping")
    public List<UserShipping> userShipping(){
        User user = userService.findOne(new Long(1));
        logger.info("User: " + user) ;
        return userShippingService.findAll(user);
    }

    @PostMapping(value = "/shipping")
    public void addUserShipping(@RequestBody UserShipping userShipping){
        User user = userService.findOne(new Long(1));
        userShipping.setUser(user);
        userShippingService.save(userShipping);
    }

    @DeleteMapping(value = "/{userId}/shipping/{userShippingId}")
    public ResponseEntity<?> deleteUserShipping(@PathVariable Long userId, @PathVariable Long userShippingId){
        userShippingService.removeUserShipping(userShippingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> loginUser(@RequestBody User user){
        logger.info("The user before: " + user);
        User theUser = userService.findByUsernamePassword(user.getUsername(), user.getPassword());
        logger.info("The user: " + theUser);
        if(null == theUser){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(theUser, HttpStatus.OK);
    }
}
