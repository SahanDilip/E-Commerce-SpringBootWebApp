package com.spring.e_commerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Product
{

    private int productId;
    private String prodName;

    private int price;

}
