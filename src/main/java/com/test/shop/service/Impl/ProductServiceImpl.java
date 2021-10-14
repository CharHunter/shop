package com.test.shop.service.Impl;

import com.test.shop.enums.ResultEnum;
import com.test.shop.exception.ShopException;
import com.test.shop.service.ProductService;
import com.test.shop.entity.ProductInfo;
import com.test.shop.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository repository;
    
    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        //id为空则为新增
        if (productInfo.getProductId()==null || "".equals(productInfo.getProductId())){
            productInfo.setProductId(UUID.randomUUID().toString());
        }
        
        return repository.save(productInfo);
    }
    
    @Override
    public void deleteOne(String id) {
        if (id==null || "".equals(id)){
            throw new ShopException(ResultEnum.ID_NOT_BE_EMPTY);
        }
        if(repository.findOne(id)==null){
            throw new ShopException(ResultEnum.PRODUCT_NOT_EXIST);
        }
        repository.delete(id);
    }


}
