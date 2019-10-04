package com.georgiev.springintroapp.services.implementations;

import com.georgiev.springintroapp.services.CarsService;
import org.springframework.stereotype.Service;

@Service
public class CarsServiceImpl implements CarsService {

    @Override
    public String[] getAllCars() {
        return new String[] {"chervena", "zelena"};
    }
}
