package com.example.shopping_list.controller;

import com.example.shopping_list.entity.ProductEntity;
import com.example.shopping_list.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add-product")
    public ResponseEntity addProduct(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam double price
            ) {
        ProductEntity productEntity = new ProductEntity(name, description, price);
        productService.save(productEntity);

        return ResponseEntity.ok("Product successfully added!");
    }

    @GetMapping("/get-products")
    public ResponseEntity getProducts() {
        List<ProductEntity> products = productService.getAll();
        String productsResponse = "";
        for (ProductEntity product: products) {
            productsResponse +=  product.getName() + ", " + product.getDescription() +
                    ", " + product.getPrice() + ", " + product.getId() +  "\n";
        }
        return ResponseEntity.ok(productsResponse);
    }

    @DeleteMapping("/remove-product")
    public ResponseEntity removeProduct(
            @RequestParam Long id
    ) {
        ProductEntity product = productService.deleteById(id);
        return ResponseEntity.ok("Product successfully removed!\n" + product.toString());
    }
}
