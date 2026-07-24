package com.lucasm.coursejava.repositories;

import com.lucasm.coursejava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository <Order,Long> {

}
