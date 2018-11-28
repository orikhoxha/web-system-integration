package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.ShippingAddress;
import org.springframework.data.repository.CrudRepository;

public interface ShippingRepository extends CrudRepository<ShippingAddress, Long> {
}
