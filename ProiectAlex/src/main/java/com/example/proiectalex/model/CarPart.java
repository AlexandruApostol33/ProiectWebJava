package com.example.proiectalex.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class CarPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carPartId;
    @NotNull(message =  "Name can't be empty")
    private String name;
    @NotNull(message =  "Category can't be empty")
    private String category;
    @NotNull(message = "Price can't be empty")
    @Min(1)
    private int price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "carId")
    private Car car;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name ="manufacturerId")
    private Manufacturer manufacturer;

    public CarPart() {
    }

    public CarPart(int carPartId, String name, String category, int price, Car car, Manufacturer manufacturer) {
        this.carPartId = carPartId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.car = car;
        this.manufacturer = manufacturer;
    }

    public CarPart(String name, String category, int price, Car car, Manufacturer manufacturer) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.car = car;
        this.manufacturer = manufacturer;
    }

    public int getCarPartId() {
        return carPartId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCarPartId(int carPartId) {
        this.carPartId = carPartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public String toString() {
        return "CarPart{" +
                "carPartId=" + carPartId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", car=" + car +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
