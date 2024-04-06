package com.ecommerce.priceservice.model;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductPriceModel {
    private Long productId;
    private BigDecimal priceForOnePiece;
}
