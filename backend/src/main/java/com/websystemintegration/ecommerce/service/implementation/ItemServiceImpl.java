package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.Item;
import com.websystemintegration.ecommerce.repository.ItemRepository;
import com.websystemintegration.ecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return ( List<Item>) itemRepository.findAll();
    }

    @Override
    public Item findOne(Long id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void removeItem(Long id) {
        itemRepository.delete(id);
    }
}
