package com.websystemintegration.ecommerce.service;

import com.websystemintegration.ecommerce.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> findAll();

    Optional<Item> findOne(Long id);

    Item save(Item item);

    void removeItem(Long id);
}
