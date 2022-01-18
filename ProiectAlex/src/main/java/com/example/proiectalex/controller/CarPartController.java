package com.example.proiectalex.controller;

import com.example.proiectalex.dto.CarPartDto;
import com.example.proiectalex.mapper.CarPartMapper;
import com.example.proiectalex.model.Car;
import com.example.proiectalex.model.CarPart;
import com.example.proiectalex.model.Manufacturer;
import com.example.proiectalex.repository.CarPartRepository;
import com.example.proiectalex.repository.CarRepository;
import com.example.proiectalex.repository.ManufacturerRepository;
import com.example.proiectalex.service.CarPartService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/carPart")
@Validated
public class CarPartController {

    private final CarPartService carPartService;
    private final CarPartRepository carPartRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final CarRepository carRepository;
    private final CarPartMapper carPartMapper;

    public CarPartController(CarPartService carPartService, CarPartRepository carPartRepository, ManufacturerRepository manufacturerRepository, CarRepository carRepository, CarPartMapper carPartMapper) {
        this.carPartService = carPartService;
        this.carPartRepository = carPartRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.carRepository = carRepository;
        this.carPartMapper = carPartMapper;
    }

    @GetMapping("/list/{carId}")
    public ResponseEntity<List<CarPart>> retrieveCarPartForModel(@RequestParam String model){
        return ResponseEntity.ok().body(carPartService.retrieveCarPartForModel(model));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<CarPart>> retrieveCarPartByName(@PathVariable String name){
        return ResponseEntity.ok().body(carPartService.retrieveCarPartByName(name));
    }
    @PostMapping("/")
    public ResponseEntity<?> newCarPart(@RequestBody @Valid CarPartDto carPartDto){
        try {
            Manufacturer manufacturer = manufacturerRepository.getById(carPartDto.getManufacturerId());
            Car car = carRepository.getById(carPartDto.getCarId());
            CarPart carPart  = carPartMapper.createCarPartDtoToCarPart(carPartDto, manufacturer, car);
            //manufacturerRepository.save(carPart.getManufacturer());
            //carRepository.save(carPart.getCar());
            return ResponseEntity.ok().body(carPartRepository.save(carPart));
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}