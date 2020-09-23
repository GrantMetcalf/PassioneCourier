package com.PassioneCourier.group2.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Product;
import com.PassioneCourier.group2.repository.unlabeled.ProductRepositoryInterface;

import java.util.HashSet;
import java.util.Set;

public class ProductRepository implements ProductRepositoryInterface {

    private Set<Product> productDB;

    public ProductRepository() {
        this.productDB = new HashSet<>();
    }

    private static ProductRepositoryInterface myProductRepository = null;

    public static ProductRepositoryInterface getMyProductRepository() {
        if (myProductRepository == null) {
            myProductRepository = new ProductRepository();
        }
        return new ProductRepository();
    }

    @Override
    public Set<Product> getAll() {
        return this.productDB;
    }

    @Override
    public Product create(Product t) {
        this.productDB.add(t);
        return t;
    }

    @Override
    public Product read(Integer myID) {
        Product product = null;
        for (Product p : this.productDB) {
            product = p;
            break;
        }
        return product;
    }

    @Override
    public Product update(Product t) {
        Product oldProduct = read(t.getProduct_ID());
        if (oldProduct != null) {
            this.productDB.remove(oldProduct);
            this.productDB.add(t);
        }
        return t;
    }

    @Override
    public boolean delete(Integer myID) {
        Product product = read(myID);
        if (product != null) this.productDB.remove(product);
        return this.productDB.remove(product);

    }

}
