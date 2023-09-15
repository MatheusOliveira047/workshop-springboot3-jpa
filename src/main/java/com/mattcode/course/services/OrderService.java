package com.mattcode.course.services;

import com.mattcode.course.entities.Order;
import com.mattcode.course.entities.User;
import com.mattcode.course.repositories.OrderRepository;
import com.mattcode.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj = repository.findById(id);
       return obj.get();
    }
}
