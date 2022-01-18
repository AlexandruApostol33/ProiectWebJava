package com.example.proiectalex.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class CarPartDto {

    @NotNull(message =  "Name can't be empty")
    private String name;
    @NotNull(message =  "Category can't be empty")
    private String category;
    @NotNull(message = "Price can't be empty")
    @Min(1)
    private int price;
    private int carId;
    private int manufacturerId;

    public CarPartDto(String name, String category, int price, int carId, int manufacturerId) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.carId = carId;
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
}
