package com.pardha.microservices.product_services.dto;


import java.math.BigDecimal;

public record ProductRequest(String id, String name, String description, BigDecimal price) {

}
