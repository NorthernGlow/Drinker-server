package com.example.drinker.controllers;

import com.example.drinker.models.BuildingPhoto;
import com.example.drinker.models.Location;
import com.example.drinker.services.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin
public class LocationController {

    private LocationService locationService;

    @PostMapping("customer/{id}/building/location")
    public void saveBuilding(@RequestBody @Validated Location location) throws Exception {
        locationService.saveLocation(location);
    }
}
