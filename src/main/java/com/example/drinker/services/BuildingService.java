package com.example.drinker.services;

import com.example.drinker.dao.BuildingDAO;
import com.example.drinker.models.Building;
import com.example.drinker.models.Customer;
import com.example.drinker.models.dto.BuildingDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public Building getBuild(int id){
        return buildingDAO.findById(id).get();
    }

    public List<BuildingDTO> getAllBuild(){
        return buildingDAO.findAllMy().stream().map(BuildingDTO::new).collect(Collectors.toList());
    }
}
