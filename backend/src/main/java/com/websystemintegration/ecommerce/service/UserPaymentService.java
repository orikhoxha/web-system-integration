package com.websystemintegration.ecommerce.service;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserPayment;

import java.util.List;

public interface UserPaymentService {

    List<UserPayment> findAll(User user);

    UserPayment findOne(User user);

    UserPayment save(UserPayment userPayment);

    void removeUserPayment(Long id);
}
