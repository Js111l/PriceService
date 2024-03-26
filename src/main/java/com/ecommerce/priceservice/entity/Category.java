package com.ecommerce.priceservice.entity;

import java.util.List;
import lombok.Data;

@Data
public class Category {

  private static final String PATTERN = "[a-zA-Z0-9-_]+(\\.[a-zA-Z0-9-_]+)*";
  private final String path;

  public Category(String path) {
    if (path.matches(PATTERN)) {
      this.path = path;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public Category(List<String> hierarchy) {
    var res = String.join(".", hierarchy);
    if (res.matches(PATTERN)) {
      this.path = res;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public boolean isSubCategoryOf(Category category) {
    return category.getPath().contains(this.path);
  }

  public boolean isSuperCategoryOf(Category category) {
    return this.path.contains(category.getPath());
  }

  public boolean isEqualCategoryTo(Category category) {
    return category.getPath().equals(this.path);
  }
}