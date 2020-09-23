package com.PassioneCourier.group2.controller.Factory.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Product;
import com.PassioneCourier.group2.Factory.unlabeled.ProductFactory;
import org.junit.Test;

public class ProductFactoryTest {

    @Test
    public void createProduct() {
        Product product = ProductFactory.createProduct("Galaxy S9", "Cellphone", "Samsung");
        System.out.println(product);
    }
}
