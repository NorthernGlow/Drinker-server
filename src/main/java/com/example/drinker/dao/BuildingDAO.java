package com.example.drinker.dao;

import com.example.drinker.models.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingDAO extends JpaRepository<Building,Integer> {
       List<Building> findByCustomerId(int id);
}
