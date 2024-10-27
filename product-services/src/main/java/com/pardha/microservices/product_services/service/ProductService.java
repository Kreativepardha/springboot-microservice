package com.pardha.microservices.product_services.service;


import com.pardha.microservices.product_services.dto.ProductRequest;
import com.pardha.microservices.product_services.model.Product;
import com.pardha.microservices.product_services.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        log.info("Product created Successfully");
    }
}