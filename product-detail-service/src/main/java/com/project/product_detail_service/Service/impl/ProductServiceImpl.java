package com.project.product_detail_service.Service.impl;


import com.project.product_detail_service.Dto.ProductRequest;

import com.project.product_detail_service.Dto.ProductResponse;
import com.project.product_detail_service.Model.Product;
import com.project.product_detail_service.Model.ProductDetails;
import com.project.product_detail_service.Service.ProductService;
import com.project.product_detail_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(ProductDetails productRequest) {
        productRepository.save(productRequest);


    }

    @Override
    public List<ProductResponse> getProductList() {
       List<ProductDetails> pd = productRepository.findAll();

        List<ProductResponse> prdList = new ArrayList<>();

        for(ProductDetails obj : pd){
            ProductResponse o = new ProductResponse();
            o.setId(obj.getId());
            o.setName(obj.getName());
            o.setDescription(obj.getDescription());
            o.setPrice(obj.getPrice());

            prdList.add(o);
        }

        return prdList;
    }
}
