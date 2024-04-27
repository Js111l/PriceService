package com.ecommerce.priceservice.model;

import java.util.List;

public record ProductPriceRequest(List<Long> productIds) {
}
