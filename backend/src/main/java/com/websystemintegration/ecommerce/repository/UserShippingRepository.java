package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.User;
import com.websystemintegration.ecommerce.domain.UserShipping;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserShippingRepository extends CrudRepository<UserShipping, Long>{

    List<UserShipping> findUserShippingByUser(User user);
}
