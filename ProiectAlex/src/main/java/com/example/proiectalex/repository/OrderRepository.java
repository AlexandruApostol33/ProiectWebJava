package com.example.proiectalex.repository;


import com.example.proiectalex.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
