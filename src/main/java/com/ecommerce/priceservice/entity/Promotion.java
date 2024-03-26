package com.ecommerce.priceservice.entity;

import com.ecommerce.priceservice.converter.CategoryConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String description;
  private LocalDateTime startDateOfPromotion;
  private LocalDateTime endDateOfPromotion;
  private BigDecimal promotionValue;
  @Enumerated(EnumType.STRING)
  private PromotionType promotionType;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
  @Convert(converter = CategoryConverter.class)
  private Category category;

}
