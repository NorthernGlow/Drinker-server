package com.example.drinker.controllers;

import com.example.drinker.models.Building;
import com.example.drinker.models.Location;
import com.example.drinker.models.dto.BuildingDTO;
import com.example.drinker.services.BuildingService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
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

    @PutMapping("building/{id}")
    public void addBuildingMainPhoto(@PathVariable int id, @RequestParam MultipartFile photo) throws IOException {
        buildingService.saveBuildingMainPhoto(id, photo);
    }

    @GetMapping("customer/drinks/{id}")
    public List<BuildingDTO> getBuildById(@PathVariable int id) {
        return buildingService.getBuildById(id);
    }
//    @GetMapping("customer/drinks/{id}/location")
//    public Location getBuildLocationById(@PathVariable int id) {
//        return buildingService.getLocationBuildById(id);
//    }

    @GetMapping("customer/{id}/allBuilding")
    public List<BuildingDTO> getBuildByCustomerId(@PathVariable int id) {
        return buildingService.getBuildByCustomerId(id);
    }

    @GetMapping("customer/drinks/all")
    public List<BuildingDTO> getAllBuilding() {
        return buildingService.getAllBuild();
    }

    @PutMapping("customer/drinks/{id}")
    public float rating(@PathVariable int id, @RequestBody float value){
        return buildingService.rating(id,value);
    }
}
