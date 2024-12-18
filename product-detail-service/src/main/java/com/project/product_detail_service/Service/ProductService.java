package com.project.product_detail_service.Service;


import com.project.product_detail_service.Dto.ProductResponse;
import com.project.product_detail_service.Model.ProductDetails;

import java.util.List;


public interface ProductService {

    public void saveProduct (ProductDetails productRequest);

    List<ProductResponse> getProductList();
}
