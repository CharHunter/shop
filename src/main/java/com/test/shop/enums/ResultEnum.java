package com.test.shop.enums;

import lombok.Getter;

@Getter
public enum  ResultEnum {

    SUCCESS(0,"success"),
    
    ID_NOT_BE_EMPTY(1,"The id cannot be empty."),
    
    PRODUCT_NOT_EXIST(2,"Product does not exist.")
    
    ;

    private Integer code;

    private String message;
    
    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
