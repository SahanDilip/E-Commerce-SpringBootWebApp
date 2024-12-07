package com.spring.e_commerce.service;

import com.spring.e_commerce.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductService
{

    List<Product> products = new ArrayList<> (Arrays.asList(new Product(100,"Bag",1000),new Product(101,"Bag2",2000),new Product(102,"Bag3",3000)));
    public List<Product> getProducts()
    {
        return products;
    }
    public Product getProductById(int prodId){
        return products.stream()
                .filter(product -> product.getProductId() == prodId)
                .findFirst().orElse(new Product(prodId,"No Item",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i =0; i< products.size();i++){
            if(products.get(i).getProductId() == prod.getProductId()){
                index = i ;
            }
        }
        products.set(index,prod);
    }

    public void deleteProdcut(int prodId) {
        int index = 0;
        for (int i =0; i< products.size();i++){
            if(products.get(i).getProductId() == prodId){
                index = i ;
            }
        }
        products.remove(index);
    }
}
