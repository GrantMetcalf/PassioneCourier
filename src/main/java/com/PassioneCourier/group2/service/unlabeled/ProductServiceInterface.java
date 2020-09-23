package com.PassioneCourier.group2.service.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Product;
import com.PassioneCourier.group2.service.IService;

import java.util.Set;

public interface ProductServiceInterface extends IService<Product, Integer> {
    Set<Product> getAll();

    //unique business logic
}
