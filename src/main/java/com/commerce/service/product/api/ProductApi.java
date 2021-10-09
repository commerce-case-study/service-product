package com.commerce.service.product.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.service.product.dao.ProductDao;
import com.commerce.service.product.entities.Product;

@RestController
public class ProductApi {
    
    Logger logger = LoggerFactory.getLogger(ProductApi.class);
    
    @Autowired
    ProductDao productDao;
    
    @PostMapping(value = "addProduct", consumes = "application/json")
    public Long addProduct(@RequestBody Product product) {
        productDao.save(product);
        return product.getId();
    }
    
    @GetMapping(value = "findProductById/{id}", produces = "application/json")
    public Product addProduct(@PathVariable Long id) {
        return productDao.findById(id).orElse(null);
    }

}
