package com.example.proiectalex.mapper;

import com.example.proiectalex.dto.CarPartDto;
import com.example.proiectalex.model.Car;
import com.example.proiectalex.model.CarPart;
import com.example.proiectalex.model.Manufacturer;
import org.springframework.stereotype.Component;

@Component
public class CarPartMapper {

    public CarPart createCarPartDtoToCarPart(CarPartDto carPartDto, Manufacturer manufacturer, Car car){
        return new CarPart(carPartDto.getName(), carPartDto.getCategory(), carPartDto.getPrice(), car, manufacturer);
    }
}
