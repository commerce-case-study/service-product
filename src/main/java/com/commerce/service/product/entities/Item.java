package com.commerce.service.product.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="t_prd_item")
public class Item {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "shop_id", nullable = false)
    private Long shopId;
    
    private String name;
    
    private BigDecimal price;
    
    private Integer quantity;
}
