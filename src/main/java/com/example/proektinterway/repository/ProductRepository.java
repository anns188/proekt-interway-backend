package com.example.proektinterway.repository;

import com.example.proektinterway.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
