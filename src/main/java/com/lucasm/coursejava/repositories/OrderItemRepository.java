package com.lucasm.coursejava.repositories;

import com.lucasm.coursejava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
