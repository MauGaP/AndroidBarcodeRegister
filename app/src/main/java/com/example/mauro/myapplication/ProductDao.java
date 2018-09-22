package com.example.mauro.myapplication;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
    List<Product> findByProductName(String productName);


}
