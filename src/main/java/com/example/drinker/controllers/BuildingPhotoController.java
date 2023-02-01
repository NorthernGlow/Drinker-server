package com.example.drinker.controllers;

import com.example.drinker.models.Building;
import com.example.drinker.models.BuildingPhoto;
import com.example.drinker.services.BuildingPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin
public class BuildingPhotoController {

    private BuildingPhotoService buildingPhotoService;


    @PostMapping("customer/{id}/building/photo")
    public void saveBuilding(@RequestBody @Validated BuildingPhoto buildingPhoto){
        buildingPhotoService.saveBuildingPhoto(buildingPhoto);
    }
}
