package com.ecom.springfullstack.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "product_category")
public class ProductCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name ="category_name" )
    private String category_name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private Set<Product> productSet;
}
