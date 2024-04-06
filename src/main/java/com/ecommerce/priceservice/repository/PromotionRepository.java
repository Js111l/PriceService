package com.ecommerce.priceservice.repository;


import com.ecommerce.priceservice.dao.entity.Promotion;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

  @Query(value = """
          SELECT p FROM Promotion p
          WHERE p.startDateOfPromotion <= CURRENT_DATE
          AND p.endDateOfPromotion >= CURRENT_DATE
          """)
  List<Promotion> getActivePromotions();

  @Query(value = """
          SELECT p FROM Promotion p
          LEFT JOIN FETCH p.product pr
          WHERE pr.id = :productId
           """)
  List<Promotion> fetchProductsPromotions(@Param("productId") Long product_id);
}
