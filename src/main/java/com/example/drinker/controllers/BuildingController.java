package com.example.drinker.controllers;

import com.example.drinker.models.Building;
import com.example.drinker.services.BuildingService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class BuildingController {

    private BuildingService buildingService;

    @PostMapping("customer/{id}/addBuilding")
    public void saveBuilding(@RequestBody @Validated Building building) throws Exception {
        buildingService.saveBuilding(building);
    }

    @GetMapping("customer/drinks/{id}")
    public Building getBuild(@PathVariable int id){
        return buildingService.getBuild(id);
    }

    @GetMapping("customer/drinks/all")
    public List<Building> getAllBuilding(){
        return buildingService.getAllBuild();
    }
}
