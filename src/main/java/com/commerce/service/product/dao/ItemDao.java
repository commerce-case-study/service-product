package com.commerce.service.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commerce.service.product.entities.Item;

public interface ItemDao extends JpaRepository<Item, Long>{

}
