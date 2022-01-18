package com.example.proiectalex.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;
    @NotNull(message =  "Brand can't be empty")
    private String brand;
    @NotNull(message =  "Model can't be empty")
    private String model;
    @NotNull(message =  "Fuel can't be empty")
    private String fuel;
    @NotNull(message = "Year can't be empty")
    @Min(1980)
    private int year;

    @OneToMany(mappedBy ="car")
    private List<CarPart> carParts;

    public Car() {
    }

    public Car(int carId, String brand, String model, String fuel, int year) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.year = year;
    }

    public Car(String brand, String model, String fuel, int year) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.year = year;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", year=" + year +
                ", carParts=" + carParts +
                '}';
    }
}
