package com.websystemintegration.ecommerce.controller;

import com.websystemintegration.ecommerce.domain.Item;
import com.websystemintegration.ecommerce.service.ItemImageService;
import com.websystemintegration.ecommerce.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemImageService itemImageService;

    @PostMapping(value = "/")
    public Item addItem(@RequestBody Item item) {
        return itemService.save(item);
    }

    @PostMapping("/file/upload")
    public ResponseEntity<?> uploadMultipartFile(@RequestParam("file") MultipartFile file) {
        try {
            logger.info("Getting in here");
            itemImageService.store(file);
            return new ResponseEntity<String>(HttpStatus.CREATED);
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
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
