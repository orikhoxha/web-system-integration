package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserPayment;
import com.websystemintegration.ecommerce.repository.UserPaymentRepository;
import com.websystemintegration.ecommerce.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    UserPaymentRepository userPaymentRepository;

    @Override
    public List<UserPayment> findAll(User user) {
        return userPaymentRepository.findUserPaymentsByUser(user);
    }

    @Override
    public UserPayment findOne(User user) {
        return userPaymentRepository.findUserPaymentByUser(user);
    }

    @Override
    public UserPayment save(UserPayment userPayment) {
        return userPaymentRepository.save(userPayment);
    }

    @Override
    public void removeUserPayment(Long id) {
        userPaymentRepository.delete(id);
    }
}
