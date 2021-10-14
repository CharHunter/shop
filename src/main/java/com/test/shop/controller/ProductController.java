package com.test.shop.controller;

import com.test.shop.entity.ProductInfo;
import com.test.shop.vo.ResultVO;
import com.test.shop.service.ProductService;
import com.test.shop.uitl.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController{
    
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResultVO add(ProductInfo productInfo){
        productService.save(productInfo);
        return ResultVOUtil.success();
    }

    @PutMapping("/update")
    public ResultVO update(@RequestBody ProductInfo productInfo){
        productService.save(productInfo);
        return ResultVOUtil.success();
    }
    
    @GetMapping("/list")
    public ResultVO list(){
        return ResultVOUtil.success(productService.findAll());
    }
    
    @DeleteMapping("/delete/{id}")
    public ResultVO delete(@PathVariable("id") String id){
        productService.deleteOne(id);
        return ResultVOUtil.success();
    }
    
}
