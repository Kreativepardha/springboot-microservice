package com.pardha.microservices.product_services.repository;


import com.pardha.microservices.product_services.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
