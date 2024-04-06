package com.ecommerce.priceservice.promotionapplier;

import java.math.BigDecimal;
public class PriceOffPromotionApplier extends PromotionApplier {

  @Override
  public BigDecimal applyPromotion(BigDecimal price, BigDecimal promotionValue) {
    if (promotionValue.compareTo(price) > 0) {
      return BigDecimal.ZERO;
    }
    return price.subtract(promotionValue);
  }
}
