package com.lucasm.coursejava.repositories;

import com.lucasm.coursejava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
