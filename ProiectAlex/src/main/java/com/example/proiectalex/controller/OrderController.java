package com.example.proiectalex.controller;

import com.example.proiectalex.model.Order;
import com.example.proiectalex.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/order")
@Validated
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/")
    public ResponseEntity<?> newOrder(@RequestBody @Valid Order order){
        return ResponseEntity.ok().body(orderService.newOrder(order));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Optional<Order>> getOrderById(@PathVariable int orderId){
        return ResponseEntity.ok().body(orderService.getOrderById(orderId));
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<String> deleteOrderById(@PathVariable int orderId){
        return ResponseEntity.ok().body(orderService.deleteOrderById(orderId));
    }
}
