package com.project.product_detail_service.repository;


import com.project.product_detail_service.Model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDetails,Integer> {

}
