package com.project.product_detail_service.controller;


import com.project.product_detail_service.Dto.ProductRequest;
import com.project.product_detail_service.Dto.ProductResponse;
import com.project.product_detail_service.Model.ProductDetails;
import com.project.product_detail_service.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody ProductDetails productDetails){
        productService.saveProduct(productDetails);

    }

    @GetMapping("/get")
    public List<ProductResponse> getProductList(){
        return productService.getProductList();
    }
}
