package com.PassioneCourier.group2.controller.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Product;
import com.PassioneCourier.group2.Factory.unlabeled.ProductFactory;
import com.PassioneCourier.group2.repository.unlabeled.implementation.ProductRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.repository.unlabeled.ProductRepositoryInterface;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductRepositoryTest {

    private static ProductRepositoryInterface repositoryInterface = new ProductRepository();
    private Product product = ProductFactory.createProduct("Galaxy", "Cellphone", "Samsung");

    @Test
    public void d_getAll() {
        System.out.println(repositoryInterface.getAll());
    }

    @Test
    public void a_create() {
        Product created = repositoryInterface.create(product);
        assertEquals(product.getProduct_ID(), created.getProduct_ID());
        System.out.println("Create: " + created);
    }

    @Test
    public void b_read() {
        Product read = repositoryInterface.read(product.getProduct_ID());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Product updated = new Product.Builder().copy(product).setProduct_name("A Series").build();
        updated = repositoryInterface.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        boolean deleted = repositoryInterface.delete(product.getProduct_ID());
        Assert.assertTrue(deleted);
    }
}

