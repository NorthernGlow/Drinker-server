package com.example.drinker.controllers;

import com.example.drinker.models.Building;
import com.example.drinker.models.dto.BuildingDTO;
import com.example.drinker.services.BuildingService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("customer/drinks/{id}")
    public List<Object> getBuild(@PathVariable int id){

        BuildingDTO build = buildingService.getBuild(id);
        List<Object> objects = new ArrayList<>();
        objects.add(build);
        objects.add(build.getLocation());
        objects.add(build.getSpecifics());
        objects.add(build.getTeg());
        System.out.println(objects);
        return objects;
    }



    @GetMapping("customer/drinks/all")
    public List<BuildingDTO> getAllBuilding(){
        return buildingService.getAllBuild();
    }
}
