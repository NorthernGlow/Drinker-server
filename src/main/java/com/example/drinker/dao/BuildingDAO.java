package com.example.drinker.dao;

import com.example.drinker.models.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingDAO extends JpaRepository<Building,Integer> {

    @Query("select b from Building b join Location l on l.id = b.location_id")
    List<Building> findAllMy();

}
