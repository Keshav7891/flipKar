package com.app.flipKar.models;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleType {

    @PostMapping
    public void createVehicleType(@RequestBody VehicleType vehicleType){

    }

}
