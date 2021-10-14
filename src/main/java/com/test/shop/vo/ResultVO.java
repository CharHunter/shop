package com.test.shop.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO<T> implements Serializable{

    private static final long serialVersionUID = -8339585980967440878L;

    //    错误
    private Integer code;

//    提示信息
    private String msg;

//    具体内容
    private T data;

}
