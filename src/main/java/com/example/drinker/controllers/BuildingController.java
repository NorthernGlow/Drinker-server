package com.example.drinker.controllers;

import com.example.drinker.models.Building;
import com.example.drinker.models.dto.Building2DTO;
import com.example.drinker.models.dto.BuildingDTO;
import com.example.drinker.services.BuildingService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class BuildingController {

    @Autowired
    private ModelMapper modelMapper;
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
    public Building2DTO getBuildById(@PathVariable int buildId) {
        Building building = buildingService.getBuildById(buildId);
        Building2DTO map = modelMapper.map(building, Building2DTO.class);
        return map;
    }

    @GetMapping("customer/{customerId}/allBuilding")
    public List<BuildingDTO> getBuildByCustomerId(@PathVariable int customerId) {
        return buildingService.getBuildByCustomerId(customerId);
    }

    @GetMapping("customer/drinks/all")
    public List<BuildingDTO> getAllBuilding() {
        return buildingService.getAllBuild();
    }

    @GetMapping("customer/drinks/searchBuild/{name}")
    public List<BuildingDTO> getBuildsByName(@PathVariable String name){
        return buildingService.getBuildsByName(name);
    }

    @PutMapping("customer/drinks/{buildId}")
    public float rating(@PathVariable int buildId, @RequestBody float value){
        return buildingService.rating(buildId,value);
    }
}
