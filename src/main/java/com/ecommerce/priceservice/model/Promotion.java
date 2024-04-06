package com.ecommerce.priceservice.model;

import com.ecommerce.priceservice.util.Category;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


public record Promotion(
    String name,
    String description,
    LocalDateTime startDateOfPromotion,
    LocalDateTime endDateOfPromotion,
    BigDecimal value,
    List<Integer> products,
    Category category) {

}
