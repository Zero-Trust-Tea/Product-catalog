package com.example.shopping_list.repository.products;

import com.example.shopping_list.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<ProductEntity, Long> {
}
