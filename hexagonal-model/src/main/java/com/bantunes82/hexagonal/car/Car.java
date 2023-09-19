package com.bantunes82.hexagonal.car;

import org.jmolecules.ddd.annotation.Entity;

import java.time.Year;

@Entity
public class Car {

    //bean validation
    private String plate;

    private String model;

    private Year year;




}
