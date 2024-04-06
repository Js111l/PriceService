package com.ecommerce.priceservice.service;

import com.ecommerce.priceservice.exceptions.LogicalException;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Transactional(rollbackFor = LogicalException.class)
public @interface SafeTransactional {
}
