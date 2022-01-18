package com.example.proiectalex.repository;

import com.example.proiectalex.model.Car;
import com.example.proiectalex.model.CarPart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    Car findAllByModel(String model);
}
