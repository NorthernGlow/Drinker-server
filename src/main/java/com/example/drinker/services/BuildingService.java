package com.example.drinker.services;

import com.example.drinker.dao.BuildingDAO;
import com.example.drinker.models.Building;
import com.example.drinker.models.Customer;
import com.example.drinker.models.Location;
import com.example.drinker.models.dto.BuildingDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BuildingService {

    private BuildingDAO buildingDAO;

    public int saveBuilding(Building building) throws Exception {
        if (building != null){
            buildingDAO.save(building);
            return building.getId();
        }else {
            throw new Exception();
        }
    }

    public void saveBuildingMainPhoto(int id, MultipartFile photo) throws IOException {
        Building build = buildingDAO.findById(id).get();
        String namePhoto = build.getName() + "_" + build.getId() + "_photo.png";
        String pathToSaveFile = System.getProperty("user.home") + File.separator + "IdeaProjects" + File.separator + "Drinker" + File.separator + "src" + File.separator + "buildPhoto" + File.separator + namePhoto;
        photo.transferTo(new File(pathToSaveFile));
        build.setMainPhoto(namePhoto);
        buildingDAO.save(build);
    }

    public List<BuildingDTO> getBuildById(int id){
        return buildingDAO.findById(id).stream().map(BuildingDTO::new).collect(Collectors.toList());
    }

//    public Location getLocationBuildById(int id){
//        Location location = buildingDAO.findById(id).get().getLocation();
//        System.out.println(location);
//        return location;
//    }


    public List<BuildingDTO> getBuildByCustomerId(int id){
        return buildingDAO.findByCustomerId(id).stream().map(BuildingDTO::new).collect(Collectors.toList());
    }

    public List<BuildingDTO> getAllBuild(){
        return buildingDAO.findAll().stream().map(BuildingDTO::new).collect(Collectors.toList());
    }

    public float rating(int id, float value){
        Building building = buildingDAO.findById(id).get();
        float rating = Float.parseFloat(building.getRating());
        building.setRating(Float.toString((rating+value)/2));
        return Float.parseFloat(building.getRating());
    }
}
