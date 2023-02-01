package com.example.drinker.controllers;

import com.example.drinker.models.BuildingPhoto;
import com.example.drinker.models.Specifics;
import com.example.drinker.services.SpecificsService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin
public class SpecificsController {

    private SpecificsService specificsService;

    @PostMapping("customer/{id}/building/specifics")
    public void saveBuilding(@RequestBody @Validated Specifics specifics){
        specificsService.saveSpecifics(specifics);
    }
}
