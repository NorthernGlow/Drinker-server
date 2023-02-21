package com.example.drinker.services;

import com.example.drinker.dao.BuildingDAO;
import com.example.drinker.models.Building;
import com.example.drinker.models.dto.BuildingDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
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

    public List<BuildingDTO> getBuildById(int id){
        return buildingDAO.findById(id).stream().map(BuildingDTO::new).collect(Collectors.toList());
    }

    public List<BuildingDTO> getBuildByCustomerId(int id){
        return buildingDAO.findByCustomerId(id).stream().map(BuildingDTO::new).collect(Collectors.toList());
    }

    public List<BuildingDTO> getAllBuild(){
        return buildingDAO.findAll().stream().map(BuildingDTO::new).collect(Collectors.toList());
    }

}
