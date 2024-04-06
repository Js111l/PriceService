package com.ecommerce.priceservice.dao.entity;

import com.ecommerce.priceservice.converter.CategoryConverter;
import com.ecommerce.priceservice.util.Category;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "PRODUCT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "start_date_of_sale", nullable = false)
    private LocalDateTime startDateOfSale;
    @Column(name = "end_date_of_sale", nullable = false)
    private LocalDateTime endDateOfSale;
    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Promotion> promotions;
    @Convert(converter = CategoryConverter.class)
    @Column(name = "product_categoory", nullable = false)
    private Category category;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(name = "PRODUCT_PRICE",
            joinColumns =
            @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "price_id", referencedColumnName = "id")
    )
    private Set<Price> prices;

}
