package com.example.proiectalex.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @NotNull(message =  "Status can't be empty")
    private String orderStatus;

    @ManyToMany
    @JoinTable(name = "car_part_orders",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "carPartId"))
    private List<CarPart> carParts;

    @ManyToOne
    @JoinColumn(name = "idBuyer")
    private User user;



    public Order() {
    }

    public Order(int orderId, String orderStatus, List<CarPart> carParts, User user) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.carParts = carParts;
        this.user = user;
    }

    public Order(String orderStatus, List<CarPart> carParts, User user) {
        this.orderStatus = orderStatus;
        this.carParts = carParts;
        this.user = user;
    }

    public Order(String orderStatus, User user) {
        this.orderStatus = orderStatus;
        this.user = user;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", carParts=" + carParts +
                ", user=" + user +
                '}';
    }
}
