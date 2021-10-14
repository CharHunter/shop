package com.test.shop.exception;

import com.test.shop.enums.ResultEnum;
import lombok.Getter;

@Getter
public class ShopException extends RuntimeException {
    private Integer code;

    public ShopException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

    public ShopException(Integer code, String message){
        super(message);
        this.code=code;
    }
}
