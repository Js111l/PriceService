package com.ecommerce.priceservice.converter;

import com.ecommerce.priceservice.util.Category;
import jakarta.persistence.AttributeConverter;

public class CategoryConverter implements AttributeConverter<Category, String> {

  @Override
  public String convertToDatabaseColumn(Category attribute) {
    return attribute.getPath();
  }

  @Override
  public Category convertToEntityAttribute(String dbData) {
    return new Category(dbData);
  }
}
