package com.PassioneCourier.group2.controller.unlabeled;


import com.PassioneCourier.group2.Entity.unlabeled.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {



    @PostMapping("/create")
    public Product create(@RequestBody Product product){
        return product;
    }

}
