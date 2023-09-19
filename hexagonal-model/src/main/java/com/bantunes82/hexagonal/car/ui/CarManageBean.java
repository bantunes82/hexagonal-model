package com.bantunes82.hexagonal.car.ui;

import com.bantunes82.hexagonal.car.Car;
import com.bantunes82.hexagonal.car.CarSell;
import com.bantunes82.hexagonal.car.CarService;

import java.util.List;

public class CarManageBean {

    private final CarService service;

    public CarManageBean(CarService service) {
        this.service = service;
    }

    public List<Car> findAll(){
        return service.findAll();
    }

    public void insert(Car car){
        service.save(car);
    }

    public void delete(Car car){
        service.delete(car);
    }

    public void vistoria(Car car){
        service.vistoria(car);
    }

    public void mudar(Car car){
        //http
        CarSell.CarRequest carRequest = null;
        service.mudar(carRequest);
        //http
    }

    public void modificarCarro(Car car){
        service.modificarCarro(car);
    }

}
