package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
