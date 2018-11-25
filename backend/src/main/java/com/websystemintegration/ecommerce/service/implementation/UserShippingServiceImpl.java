package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserPayment;
import com.websystemintegration.ecommerce.domain.UserShipping;
import com.websystemintegration.ecommerce.repository.UserPaymentRepository;
import com.websystemintegration.ecommerce.repository.UserShippingRepository;
import com.websystemintegration.ecommerce.service.UserPaymentService;
import com.websystemintegration.ecommerce.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    UserShippingRepository userShippingRepository;

    @Override
    public List<UserShipping> findAll(User user) {
        return userShippingRepository.findUserShippingByUser(user);
    }

    @Override
    public UserShipping findOne(User user) {
        return null;
    }

    @Override
    public UserShipping save(UserShipping userShipping) {
        return userShippingRepository.save(userShipping);
    }

    @Override
    public void removeUserShipping(Long id) {
        userShippingRepository.delete(id);
    }

}
