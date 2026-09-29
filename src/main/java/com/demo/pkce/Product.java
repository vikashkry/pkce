package com.demo.pkce;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private String productId;
    private String name;
    private String description;
    private double price;
}
