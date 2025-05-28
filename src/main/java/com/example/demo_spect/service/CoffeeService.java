package com.example.demo_spect.service;
import com.example.demo_spect.model.CoffeeType;

public class CoffeeService {

    public void prepare(CoffeeType coffeeType) {
        System.out.printf("Votre %s est en cours de préparation... %n", coffeeType.getLabel());
    }
}
