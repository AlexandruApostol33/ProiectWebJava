package com.example.proiectalex.service;

import com.example.proiectalex.repository.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @InjectMocks
    private OrderService orderService;
    @Mock
    private OrderRepository orderRepository;

    @Test
    @DisplayName("New order Test")
    void newOrder() {
    }

    @Test
    @DisplayName("GetOrderById test")
    void getOrderById() {
        int orderId = 1;
    }

    @Test
    @DisplayName("DeleteOrdereById")
    void deleteOrderById() {
    }
}