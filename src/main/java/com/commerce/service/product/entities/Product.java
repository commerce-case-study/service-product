package com.commerce.service.product.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="t_itm_product")
public class Product {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private BigDecimal price;
    
    private Integer quantity;
}
