package com.ecommerce.priceservice.promotionapplier;

import java.util.HashMap;
import java.util.Map;

final public class PromotionApplierFactory {

  private static final Map<String, PromotionApplier> promotionApplierMap = new HashMap<>();

  public static Map<String, PromotionApplier> getPromotionApplierMap() {
    promotionApplierMap.put("PercentOff", new PercentOffPromotionApplier());
    promotionApplierMap.put("PriceOff", new PriceOffPromotionApplier());
    return promotionApplierMap;
  }

}
