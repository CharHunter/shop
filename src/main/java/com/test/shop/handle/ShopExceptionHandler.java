package com.test.shop.handle;

import com.test.shop.uitl.ResultVOUtil;
import com.test.shop.vo.ResultVO;
import com.test.shop.exception.ShopException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ShopExceptionHandler {

    @ExceptionHandler(value = ShopException.class)
    @ResponseBody
    public ResultVO handleSellerException(ShopException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }
}
