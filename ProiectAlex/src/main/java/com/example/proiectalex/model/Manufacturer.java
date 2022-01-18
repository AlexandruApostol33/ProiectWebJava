package com.example.proiectalex.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Manufacturer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manufacturerId;
    @NotNull(message =  "Name can't be empty")
    private String name;

    @OneToMany(mappedBy = "manufacturer")
    private List<CarPart> carPart;

    public Manufacturer() {
    }

    public Manufacturer(int manufacturerId, String name) {
        this.manufacturerId = manufacturerId;
        this.name = name;
    }

    public Manufacturer(String name) {
        this.name = name;
    }

    public List<CarPart> getCarPart() {
        return carPart;
    }

    public void setCarPart(List<CarPart> carPart) {
        this.carPart = carPart;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturerId=" + manufacturerId +
                ", name='" + name + '\'' +
                ", carPart=" + carPart +
                '}';
    }
}
