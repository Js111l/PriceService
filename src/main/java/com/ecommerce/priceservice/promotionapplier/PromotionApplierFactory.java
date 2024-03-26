package com.ecommerce.priceservice.promotionapplier;

import java.util.HashMap;
import java.util.Map;

final public class PromotionApplierFactory {

  private static final Map<String, PromotionApplier> promotionApplierMap = new HashMap<>();

  public static Map<String, PromotionApplier> getPromotionApplierMap() {
    promotionApplierMap.put("PercentOff", new PercentOff_PromotionApplier());
    promotionApplierMap.put("PriceOff", new PriceOff_PromotionApplier());
    return promotionApplierMap;
  }

}
