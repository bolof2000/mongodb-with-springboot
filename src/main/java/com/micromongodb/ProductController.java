package com.micromongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @PostMapping("/")
    public List<Product> addProducts(@RequestBody final List<Product> products){
        return productDao.saveAll(products);
    }

    @GetMapping("/{productId}")
    public Product findProduct(@PathVariable final String productId){
        return productDao.findById(productId);
    }

    @GetMapping("/")
    public List<Product> findProducts(){
        return productDao.findAll();
    }

}
