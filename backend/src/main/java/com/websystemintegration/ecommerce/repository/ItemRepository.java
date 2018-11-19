package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
