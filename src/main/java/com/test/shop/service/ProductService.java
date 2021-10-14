package com.test.shop.service;

import com.test.shop.entity.ProductInfo;

import java.util.List;

public interface ProductService {
    
    ProductInfo findOne(String productId);

    List<ProductInfo> findAll();

    ProductInfo save(ProductInfo productInfo);
    
    void deleteOne(String id);
    
}
