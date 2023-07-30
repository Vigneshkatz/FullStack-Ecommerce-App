package com.ecom.springfullstack.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "product")
@Data
public class Product {

//    add fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private BigDecimal unit_price;
    @Column(name = "image_url")
    private String image_url;
    @Column(name = "active")
    private boolean active;
    @Column(name = "units_in_stock")
    private Long units_in_stock;
    @Column(name = "date_created")
    private Date date_created;
    @CreatedDate
    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date last_updated;
    @Column(name = "category_id")
    private Long category_id;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private Set<ProductCategory> productCategorySet;

}
