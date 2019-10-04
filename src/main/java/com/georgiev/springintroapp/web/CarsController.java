package com.georgiev.springintroapp.web;

import com.georgiev.springintroapp.entities.Car;
import com.georgiev.springintroapp.repositories.CarsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CarsController {

    private final CarsRepository repository;

    public  CarsController(CarsRepository repository){
        this.repository = repository;
    }

    @GetMapping("/cars")
    public List<Car> getCars(){

        return repository.findAll();
    }


}
