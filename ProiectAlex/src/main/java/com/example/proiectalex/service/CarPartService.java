package com.example.proiectalex.service;

import com.example.proiectalex.model.Car;
import com.example.proiectalex.model.CarPart;
import com.example.proiectalex.repository.CarPartRepository;
import com.example.proiectalex.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarPartService {

    private final CarPartRepository carPartRepository;
    private final CarRepository carRepository;

    public CarPartService(CarPartRepository carPartRepository, CarRepository carRepository) {
        this.carPartRepository = carPartRepository;
        this.carRepository = carRepository;
    }

    public List<CarPart> retrieveCarPartForModel(String carModel) {
        Car car = carRepository.findAllByModel(carModel);
        return carPartRepository.findAllByCar(car);
    }

    public List<CarPart> retrieveCarPartByName(String name) {
        return carPartRepository.findAllByName(name);
    }
}
