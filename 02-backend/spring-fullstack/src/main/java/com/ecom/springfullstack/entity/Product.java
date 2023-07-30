package com.ecom.springfullstack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class Product {

//    add fields
    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal unit_price;
    private String image_url;
    private boolean active;
    private Long units_in_stock;
    private Date date_created;
    private Date last_updated;
    private Long category_id;

}
