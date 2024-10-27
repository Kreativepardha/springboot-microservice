package com.pardha.microservices.product_services.controller;


import com.pardha.microservices.product_services.dto.ProductRequest;
import com.pardha.microservices.product_services.dto.ProductResponse;
import com.pardha.microservices.product_services.model.Product;
import com.pardha.microservices.product_services.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
       return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
         return productService.getAllProducts();
    }





}
