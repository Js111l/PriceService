package com.ecommerce.priceservice.promotionapplier;

import java.math.BigDecimal;

public abstract class PromotionApplier {

  public abstract BigDecimal applyPromotion(BigDecimal price, BigDecimal promotionValue);
}
