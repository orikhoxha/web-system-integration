package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOne(Long id) {
        return null;
    }

    @Override
    public User save(User User) {
        return null;
    }

    @Override
    public void removeUser(Long id) {

    }
}
