package com.ecommerce.priceservice.exceptions;

import lombok.Getter;

@Getter
public class LogicalException extends RuntimeException {

    private ErrorKey key;
    public LogicalException(ErrorKey key) {
        this.key = key;
    }
}
