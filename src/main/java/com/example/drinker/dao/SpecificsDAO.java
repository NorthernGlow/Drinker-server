package com.example.drinker.dao;

import com.example.drinker.models.Specifics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificsDAO extends JpaRepository<Specifics,Integer> {
}
