package com.ecommerce.priceservice.controller;

import com.ecommerce.priceservice.dao.entity.Promotion;
import com.ecommerce.priceservice.service.PromotionService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promotions")
public class PromotionController {
    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @PostMapping
    public Promotion savePromotion(Promotion promotion) {
        return this.promotionService.savePromotion(promotion);
    }

    @PutMapping
    public Promotion updatePromotion(Promotion promotion) {
        return this.promotionService.updatePromotion(promotion);
    }

    @GetMapping("/{id}")
    public Promotion getPromotion(@PathVariable long id) {
        return this.promotionService.getPromotionById(id);
    }

    @GetMapping
    public List<Promotion> getAll() {
        return this.promotionService.findAll();
    }
}

