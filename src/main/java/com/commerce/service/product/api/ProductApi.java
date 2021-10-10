package com.commerce.service.product.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.service.product.dao.ItemDao;
import com.commerce.service.product.entities.Item;

@RestController
public class ProductApi {
    
    Logger logger = LoggerFactory.getLogger(ProductApi.class);
    
    @Autowired
    ItemDao itemDao;
    
    @PostMapping(value = "addItem", consumes = "application/json")
    public Long addItem(@RequestBody Item product) {
        itemDao.save(product);
        return product.getId();
    }
    
    @GetMapping(value = "findItemById/{id}", produces = "application/json")
    public Item findItemById(@PathVariable Long id) {
        return itemDao.findById(id).orElse(null);
    }

}
