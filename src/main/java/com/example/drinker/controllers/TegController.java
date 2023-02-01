package com.example.drinker.controllers;

import com.example.drinker.models.BuildingPhoto;
import com.example.drinker.models.Teg;
import com.example.drinker.services.TegService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin
public class TegController {

    private TegService tegService;

    @PostMapping("customer/{id}/building/teg")
    public void saveBuilding(@RequestBody @Validated Teg teg){
        tegService.saveTeg(teg);
    }
}
