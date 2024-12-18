package com.project.product_detail_service.Dto;

import lombok.*;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRequest {

    private String name;
    private String description;
    private BigDecimal price;


}
