package com.ecommerce.priceservice.util;

import com.ecommerce.priceservice.exceptions.ErrorKey;
import com.ecommerce.priceservice.exceptions.LogicalException;

import java.math.BigDecimal;

public class PromotionUtil {

  public static void validatePercentValue(BigDecimal percentValue) {
    if (isLessThanZero(percentValue) || isBiggerThan100(percentValue)) {
      throw new LogicalException(ErrorKey.UNPROCESSABLE_ENTITY);

    }
  }

  private static boolean isLessThanZero(BigDecimal value) {
    return value.compareTo(BigDecimal.ZERO) < 0;
  }


  private static boolean isBiggerThan100(BigDecimal value) {
    return value.compareTo(BigDecimal.valueOf(100)) > 0;
  }
}
