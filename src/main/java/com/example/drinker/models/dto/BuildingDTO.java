package com.example.drinker.models.dto;

import com.example.drinker.models.Building;
import com.example.drinker.models.Location;
import com.example.drinker.models.Specifics;
import com.example.drinker.models.Teg;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BuildingDTO {
    private int id;

    private int customerId;
    private String name;
    private String averageCheck;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "teg_id", referencedColumnName = "id")
//    private Teg teg;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "specifics_id", referencedColumnName = "id")
//    private Specifics specifics;
//
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    public BuildingDTO(Building building) {
        this.id = building.getId();
        this.customerId = building.getCustomerId();
        this.name = building.getName();
        this.averageCheck = building.getAverageCheck();
//        this.teg = building.getTeg();
//        this.specifics = building.getSpecifics();
        this.location = building.getLocation();
    }
}