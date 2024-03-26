package com.ecommerce.priceservice.entity;

import com.ecommerce.priceservice.converter.CategoryConverter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private LocalDateTime startDateOfSale;
  private LocalDateTime endDateOfSale;
  @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
  private Set<Promotion> promotions;
  @Convert(converter = CategoryConverter.class)
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
