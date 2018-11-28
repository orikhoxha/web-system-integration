package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.Payment;
import org.springframework.data.repository.CrudRepository;

public interface OrderPaymentRepository extends CrudRepository<Payment, Long> {
}
