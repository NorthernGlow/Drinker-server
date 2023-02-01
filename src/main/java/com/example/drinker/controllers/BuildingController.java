package com.example.drinker.controllers;

import com.example.drinker.models.Building;
import com.example.drinker.services.BuildingService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin
public class BuildingController {

    private BuildingService buildingService;

    @PostMapping("customer/{id}/building")
    public void saveBuilding(@RequestBody @Validated Building building) throws Exception {
        buildingService.saveBuilding(building);
    }
}
