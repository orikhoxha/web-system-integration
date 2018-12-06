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


/* API for item REST CRUD. Calls the service helper class for data manipulation */
@RestController
@RequestMapping("/api/items")
public class ItemController {

    private Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemImageService itemImageService;


    /* Accepts an Item object, returns a new object with id assigned */
    @PostMapping(value = "/")
    public Item addItem(@RequestBody Item item) {
        return itemService.save(item);
    }


    /* Accepts a file, uses the imageService for saving the file, returs CREATED status */
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


    /* Accepts the item, and the id, returns no content on update. The local update in frontend is already handled by vuex */
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
    public ResponseEntity<Item> singleItem( @PathVariable Long id) {

        Item theItem = itemService.findOne(id);
        if(null == theItem){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(theItem, HttpStatus.OK);
    }





}
