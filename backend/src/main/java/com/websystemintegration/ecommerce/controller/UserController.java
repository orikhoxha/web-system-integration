package com.websystemintegration.ecommerce.controller;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/")
    public User addUser(@RequestBody User User) {
        return userService.save(User);
    }

    @GetMapping("/")
    public List<User> getUserList(){
        return userService.findAll();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateUser(@RequestBody User User, @PathVariable Long id) {

        User theUser = userService.findOne(id);
        if(null == theUser){
            return ResponseEntity.notFound().build();
        }
        User.setId(id);
        userService.save(User);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> updateUser( @PathVariable Long id) {

        User theUser = userService.findOne(id);
        if(null == theUser){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(theUser, HttpStatus.OK);
    }
    
}
