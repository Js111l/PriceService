package com.ecommerce.priceservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

public record Cart(List<Integer> productIds) {

}
