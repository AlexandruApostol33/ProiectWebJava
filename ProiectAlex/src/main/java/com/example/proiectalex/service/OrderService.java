package com.example.proiectalex.service;


import com.example.proiectalex.model.Order;
import com.example.proiectalex.repository.OrderRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.stereotype.Service;


import java.util.Optional;
@ExtendWith(MockitoExtension.class)
@Service
public class OrderService {
    private OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Object newOrder(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> getOrderById(int orderId) {

        return orderRepository.findById(orderId);
    }

    public String deleteOrderById(int orderId) {
        orderRepository.deleteById(orderId);
        return "Order deleted successfully";
    }
}
