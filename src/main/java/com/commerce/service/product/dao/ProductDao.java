package com.commerce.service.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.service.product.entities.Product;

public interface ProductDao extends JpaRepository<Product, Long>{

}
