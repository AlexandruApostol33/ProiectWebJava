package com.example.proiectalex.repository;

import com.example.proiectalex.model.Car;
import com.example.proiectalex.model.CarPart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarPartRepository extends JpaRepository<CarPart, Integer> {


    List<CarPart> findAllByCar(Car car);
    List<CarPart> findAllByName(String name);


}
