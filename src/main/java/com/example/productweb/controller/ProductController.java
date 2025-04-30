package com.example.productweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final RestTemplate restTemplate;
    private final String backendUrl = "http://localhost:8080/api/products"; // 백엔드 API URL

    public ProductController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping
    public String listProducts(Model model) {
        // 백엔드 API에서 상품 목록을 가져옵니다
        Object products = restTemplate.getForObject(backendUrl, Object.class);
        model.addAttribute("products", products);
        return "product/list";
    }
} 