package com.example.drinker.services;

import com.example.drinker.dao.BuildingPhotoDAO;
import com.example.drinker.models.BuildingPhoto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuildingPhotoService {

    private BuildingPhotoDAO buildingPhotoDAO;

    public void saveBuildingPhoto(BuildingPhoto buildingPhoto){
        buildingPhotoDAO.save(buildingPhoto);
    }
}
