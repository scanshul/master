package com.mytraining.product_service.service.impl;

import com.mytraining.product_service.Dto.ProductRequest;
import com.mytraining.product_service.model.Product;
import com.mytraining.product_service.repository.ProductRepository;
import com.mytraining.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(ProductRequest productRequest) {
        Product product = Product.builder().name(productRequest.getName()).
                description(productRequest.getDescription()).
                price(productRequest.getPrice()).build();
        productRepository.save(product);
        log.info("Product Saved and product id {} ", product.getId());

    }
}
