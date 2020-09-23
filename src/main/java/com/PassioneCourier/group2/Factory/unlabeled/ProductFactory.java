package com.PassioneCourier.group2.Factory.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Product;

public class ProductFactory {

    public static Product createProduct(String product_name, String product_type, String product_description) {
        int productID = (int) (Math.random() * ((9999999 - 1000000) + 1)) + 1000000;
        Product product = new Product.Builder()
                .setProduct_ID(productID)
                .setProduct_name(product_name)
                .setProduct_type(product_type)
                .setProduct_description(product_description)
                .build();
        return product;
    }
}
