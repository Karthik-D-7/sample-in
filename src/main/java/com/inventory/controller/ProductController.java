package com.inventory.controller;

import com.inventory.model.Product;
import com.inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/products/add")
    public String addProduct(@ModelAttribute Product product) {
        if (product.getStock() <= 10) {
            product.setStatus("Low Stock");
        } else {
            product.setStatus("In Stock");
        }
        productRepository.save(product);
        return "redirect:/products";
    }

    @PostMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/products/edit/{id}")
    @ResponseBody
    public Product getProduct(@PathVariable Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @PostMapping("/products/update")
    public String updateProduct(@ModelAttribute Product product) {
        if (product.getStock() <= 10) {
            product.setStatus("Low Stock");
        } else {
            product.setStatus("In Stock");
        }
        productRepository.save(product);
        return "redirect:/products";
    }
} 