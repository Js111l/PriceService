package com.ecommerce.priceservice.controller;

import com.ecommerce.priceservice.model.ProductPriceModel;
import com.ecommerce.priceservice.model.ProductPriceRequest;
import com.ecommerce.priceservice.service.PriceService;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prices")
public class PriceController {

  private final PriceService priceService;

  public PriceController(PriceService priceService) {
    this.priceService = priceService;
  }

  @PostMapping
  public List<ProductPriceModel> calculateFinalPrice(@RequestBody ProductPriceRequest request) {
    return this.priceService.getFinalPrice(request.productIds());
  }
}
