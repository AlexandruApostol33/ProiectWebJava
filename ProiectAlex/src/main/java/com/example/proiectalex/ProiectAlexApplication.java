package com.example.proiectalex;

import com.example.proiectalex.model.*;
import com.example.proiectalex.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProiectAlexApplication implements CommandLineRunner {

    private final CarPartRepository carPartRepository;
    private final CarRepository carRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ShopRepository shopRepository;

    public ProiectAlexApplication(CarPartRepository carPartRepository, CarRepository carRepository, ManufacturerRepository manufacturerRepository, OrderRepository orderRepository, UserRepository userRepository, ShopRepository shopRepository) {
        this.carPartRepository = carPartRepository;
        this.carRepository = carRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.shopRepository = shopRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProiectAlexApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        User user = new User("User1", "0743234555");
        userRepository.save(user);

        Car car = new Car("Audi", "A6", "gasoline", 2009);
        carRepository.save(car);

        Manufacturer manufacturer = new Manufacturer( "Mahle");
        manufacturerRepository.save(manufacturer);

        CarPart carPart = new CarPart( "Cardan", "Tren de rulare", 1900, car, manufacturer);
        List<CarPart> carPart2 = new ArrayList<CarPart>();
        carPart2.add(carPart);
        carPartRepository.save(carPart);

        Shop shop1 = new Shop( "Epiesa Bacau", "Bacau, str. Alexandru cel Bun, nr 20", "0753233554");
        Shop shop2 = new Shop( "Epiesa Suceava", "Suceava, str. Mihai Emimenscu, nr 11", "0745877996");

        shopRepository.save(shop1);
        shopRepository.save(shop2);
        Order order1 = new Order("Pending", carPart2, user);
        //orderRepository.save(order1);

        //List<CarPart> carToAdd = new ArrayList();
        //carToAdd.add(carPart);
        //Order order1 = new Order(1, "OK", carToAdd, user);
        //orderRepository.save(order1);



    }
}
