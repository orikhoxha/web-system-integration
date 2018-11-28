package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.ShippingAddress;
import com.websystemintegration.ecommerce.repository.ShippingRepository;
import com.websystemintegration.ecommerce.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {


    @Autowired
    ShippingRepository shippingRepository;

    @Override
    public ShippingAddress save(ShippingAddress shippingAddress) {
        return shippingRepository.save(shippingAddress);
    }
}
