package com.PassioneCourier.group2.repository.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Product;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface ProductRepositoryInterface extends IRepository<Product, Integer> {
    Set<Product> getAll();
}
