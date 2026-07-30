package com.lucasm.coursejava.repositories;

import com.lucasm.coursejava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
