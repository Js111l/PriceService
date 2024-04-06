package com.ecommerce.priceservice.promotionapplier;

import java.math.BigDecimal;

public class PercentOffPromotionApplier extends PromotionApplier {

  @Override
  public BigDecimal applyPromotion(BigDecimal price, BigDecimal promotionValue) {
    var valueToSubstract = price.multiply(promotionValue).divide(BigDecimal.valueOf(100));
    var finalValue = price.subtract(valueToSubstract);
    if (finalValue.compareTo(BigDecimal.ZERO) < 0) {
      return BigDecimal.ZERO;
    }
    return price.subtract(valueToSubstract);
  }
}
