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

    public BuildingDTO getBuild(int id){
        Building building = buildingDAO.findById(id).get();
        System.out.println(buildingDAO.findById(id));
        System.out.println(building);
        return new BuildingDTO(building);
    }

    public List<BuildingDTO> getAllBuild(){
        return buildingDAO.findAll().stream().map(BuildingDTO::new).collect(Collectors.toList());
    }

}
