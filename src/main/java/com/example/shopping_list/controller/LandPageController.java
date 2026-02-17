package com.example.shopping_list.controller;

import com.example.shopping_list.repository.ProductRepo;
import com.example.shopping_list.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandPageController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(@Autowired Model model) {

        model.addAttribute("products", productService.getAll());

        return "index";
    }
}
