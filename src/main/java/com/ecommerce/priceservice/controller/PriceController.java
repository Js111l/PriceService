package com.ecommerce.priceservice.controller;

import com.ecommerce.priceservice.service.PriceService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prices")
public class PriceController {

  private final PriceService priceService;

  public PriceController(PriceService priceService) {
    this.priceService = priceService;
  }

  @GetMapping()
  public BigDecimal calculateFinalPrice(@RequestBody List<Long> productIds) {
  return this.priceService.getFinalPrice(productIds);
  }
}
