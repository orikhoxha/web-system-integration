package com.websystemintegration.ecommerce.service;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserShipping;

import java.util.List;

public interface UserShippingService {

    List<UserShipping> findAll(User user);

    UserShipping findOne(User user);

    UserShipping save(UserShipping userShipping);

    void removeUserShipping(Long id);
}
