package com.ecommerce.priceservice.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "products")
public class Price {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private BigDecimal bigDecimal;
  private LocalDate startDate;
  private LocalDate endDate;
  @ManyToMany(mappedBy = "prices")
  private Set<Product> products;
}
