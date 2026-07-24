package com.lucasm.coursejava.services;

import com.lucasm.coursejava.entities.Order;
import com.lucasm.coursejava.repositories.OrderRepository;
import com.lucasm.coursejava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }


}
