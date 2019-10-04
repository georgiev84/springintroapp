package com.georgiev.springintroapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CarsController {

    @GetMapping("/")
    public String getCars(){
        return "index";
    }


}
