package com.example.shopping_list.service;

import com.example.shopping_list.entity.ProductEntity;
import com.example.shopping_list.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public ProductService() {
    }

    @Autowired
    private ProductRepo productRepo;

    public ProductEntity save(ProductEntity productEntity) {
        productRepo.save(productEntity);
        return productEntity;
    }

    public ProductEntity findById(Long id) {
        return productRepo.findById(id).get();
    }

    public ProductEntity deleteById(Long id) {
        ProductEntity productEntity = productRepo.findById(id).get();
        productRepo.deleteById(id);
        return productEntity;
    }

    public List<ProductEntity> getAll() {
        List<ProductEntity> products = new ArrayList<>();
        for (ProductEntity productEntity : productRepo.findAll()) {
            products.add(productEntity);
        }
        return products;
    }
}
