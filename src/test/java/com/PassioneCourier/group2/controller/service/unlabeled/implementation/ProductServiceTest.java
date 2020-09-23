package com.PassioneCourier.group2.controller.service.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Product;
import com.PassioneCourier.group2.Factory.unlabeled.ProductFactory;
import com.PassioneCourier.group2.service.unlabeled.implementation.ProductService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.service.unlabeled.ProductServiceInterface;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductServiceTest {

    private static ProductServiceInterface serviceInterface = ProductService.getServiceInterface();
    private Product product = ProductFactory.createProduct("Galaxy", "Cellphone", "Samsung");

    @Test
    public void d_getAll() {
        Set<Product> products = serviceInterface.getAll();
        assertEquals(1, products.size());
        System.out.println("All products: " + products);
    }

    @Test
    public void a_create() {
        Product created = serviceInterface.create(product);
        Assert.assertEquals(product.getProduct_ID(), created.getProduct_ID());
        System.out.println("Created : " + created);
    }

    @Test
    public void b_read() {
        Product read = serviceInterface.read(product.getProduct_ID());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Product updated = new Product.Builder().copy(product).setProduct_name("A Series").build();
        updated = serviceInterface.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        boolean deleted = serviceInterface.delete(product.getProduct_ID());
        Assert.assertTrue(deleted);
    }
}