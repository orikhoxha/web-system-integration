package com.websystemintegration.ecommerce.controller;

import com.websystemintegration.ecommerce.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {


    @RequestMapping("/main")
    public @ResponseBody User hello() {
        return new User("Orik", "Hoxha");
    }
}
