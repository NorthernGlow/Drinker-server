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

    @PostMapping("customer/{customerId}/addBuilding")
    public int saveBuilding(@RequestBody @Validated Building building) throws Exception {
       return buildingService.saveBuilding(building);
    }

    @PutMapping("building/{buildId}")
    public void addBuildingMainPhoto(@PathVariable int buildId, @RequestParam MultipartFile photo) throws IOException {
        buildingService.saveBuildingMainPhoto(buildId, photo);
    }

    @GetMapping("customer/drinks/{buildId}")
    public List<BuildingDTO> getBuildById(@PathVariable int buildId) {
        return buildingService.getBuildById(buildId);
    }

    //НЕ ПРАЦЮЄ
    @GetMapping("customer/drinks/{id}/location")
    public Location getBuildLocationById(@PathVariable int id) {
        return buildingService.getLocationBuildById(id);
    }

    @GetMapping("customer/{customerId}/allBuilding")
    public List<BuildingDTO> getBuildByCustomerId(@PathVariable int customerId) {
        return buildingService.getBuildByCustomerId(customerId);
    }

    @GetMapping("customer/drinks/all")
    public List<BuildingDTO> getAllBuilding() {
        return buildingService.getAllBuild();
    }

    @PutMapping("customer/drinks/{buildId}")
    public float rating(@PathVariable int buildId, @RequestBody float value){
        return buildingService.rating(buildId,value);
    }
}
