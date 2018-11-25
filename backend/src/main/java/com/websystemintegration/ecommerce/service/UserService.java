package com.websystemintegration.ecommerce.service;

import com.websystemintegration.ecommerce.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findOne(Long id);

    User save(User User);

    void removeUser(Long id);


}
