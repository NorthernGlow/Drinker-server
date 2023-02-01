package com.example.drinker.dao;

import com.example.drinker.models.BuildingPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingPhotoDAO extends JpaRepository<BuildingPhoto,Integer> {
}
