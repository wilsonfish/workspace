package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface ProductRepository extends JpaRepository<Product, Long> {

}
