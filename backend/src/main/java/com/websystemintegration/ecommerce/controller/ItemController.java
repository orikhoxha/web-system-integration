package com.websystemintegration.ecommerce.controller;

import com.websystemintegration.ecommerce.domain.Item;
import com.websystemintegration.ecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemController {


    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/")
    public Item addItem(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping("/")
    public List<Item> getItemList(){
        return itemService.findAll();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateItem(@RequestBody Item item, @PathVariable Long id) {

        Item theItem = itemService.findOne(id);
        if(null == theItem){
            return ResponseEntity.notFound().build();
        }
        item.setId(id);
        itemService.save(item);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Item> updateItem( @PathVariable Long id) {

        Item theItem = itemService.findOne(id);
        if(null == theItem){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(theItem, HttpStatus.OK);
    }

}
