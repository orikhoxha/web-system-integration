package com.websystemintegration.ecommerce.controller;

import com.websystemintegration.ecommerce.domain.Item;
import com.websystemintegration.ecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/add")
    public Item addItem(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping("/itemList")
    public List<Item> getItemList(){
        return itemService.findAll();
    }

    @PostMapping(value = "/update")
    public Item updateItem(@RequestBody Item item) {
        return itemService.save(item);
    }
}
