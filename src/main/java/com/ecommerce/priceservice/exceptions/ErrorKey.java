package com.ecommerce.priceservice.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public enum ErrorKey {
    NOT_FOUND(HttpStatus.NOT_FOUND),
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),
    UNPROCESSABLE_ENTITY(HttpStatus.UNPROCESSABLE_ENTITY)


    ;



    private HttpStatus code;
    ErrorKey(HttpStatus httpStatus) {
        this.code = httpStatus;
    }
}
