package com.example.shopping_list.repository;

import com.example.shopping_list.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface ProductRepo extends CrudRepository<ProductEntity, Long> {
}
