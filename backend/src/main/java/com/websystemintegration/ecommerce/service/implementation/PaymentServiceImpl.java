package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.controller.ItemController;
import com.websystemintegration.ecommerce.domain.Payment;
import com.websystemintegration.ecommerce.repository.PaymentRepository;
import com.websystemintegration.ecommerce.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public Payment save(Payment payment) {
        logger.info("The payment: " + payment);
       // paymentRepository.save(payment);
        //return orderPaymentRepository.save(payment);
        return null;
    }
}
