package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserPayment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

    List<UserPayment> findUserPaymentsByUser(User user);
    UserPayment findUserPaymentByUser(User user);

}
