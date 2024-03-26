package com.ecommerce.priceservice.service;

import com.ecommerce.priceservice.entity.Promotion;
import com.ecommerce.priceservice.exceptions.ErrorKey;
import com.ecommerce.priceservice.exceptions.LogicalException;
import com.ecommerce.priceservice.repository.PromotionRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PromotionService {

  private final PromotionRepository promotionRepository;

  public PromotionService(PromotionRepository promotionRepository) {
    this.promotionRepository = promotionRepository;
  }


  public Promotion savePromotion(Promotion promotion) {
    return this.promotionRepository.save(promotion);
  }

  public Promotion getPromotionById(long id) {
    return this.promotionRepository.findById(id).orElseThrow(
            () -> new LogicalException(ErrorKey.NOT_FOUND)
    );
  }

  public List<Promotion> findAll() {
    return this.promotionRepository.findAll();
  }

  public List<Promotion> getActivePromotions() {
    return this.promotionRepository.getActivePromotions();
  }

  public Promotion updatePromotion(Promotion promotion) {
    var promotionToUpdate = this.promotionRepository.findById(promotion.getId()).orElseThrow(
            () -> new LogicalException(ErrorKey.NOT_FOUND)
    );
    promotionToUpdate.setPromotionType(promotion.getPromotionType());
    promotionToUpdate.setPromotionValue(promotion.getPromotionValue());
    promotionToUpdate.setStartDateOfPromotion(promotion.getStartDateOfPromotion());
    promotionToUpdate.setEndDateOfPromotion(promotion.getEndDateOfPromotion());
    promotionToUpdate.setName(promotion.getName());
    promotionToUpdate.setDescription(promotion.getDescription());
    promotionToUpdate.setCategory(promotion.getCategory());
    promotionToUpdate.setProduct(promotion.getProduct());

    return this.promotionRepository.save(promotionToUpdate);
  }
}
