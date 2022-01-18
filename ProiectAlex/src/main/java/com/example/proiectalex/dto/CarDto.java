package com.example.proiectalex.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CarDto {
    @NotNull(message =  "Brand can't be empty")
    private String brand;
    @NotNull(message =  "Model can't be empty")
    private String model;
    @NotNull(message =  "Fuel can't be empty")
    private String fuel;
    @NotNull(message = "Year can't be empty")
    @Min(1980)
    private int year;

}
