package com.example.drinker.services;

import com.example.drinker.dao.BuildingDAO;
import com.example.drinker.models.Building;
import com.example.drinker.models.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuildingService {

    private BuildingDAO buildingDAO;

    public void saveBuilding(Building building) throws Exception {
        if (building != null){
            buildingDAO.save(building);
        }else {
            throw new Exception();
        }
    }

}
