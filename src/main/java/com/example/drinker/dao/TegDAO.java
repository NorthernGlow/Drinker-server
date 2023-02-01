package com.example.drinker.dao;

import com.example.drinker.models.Teg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TegDAO extends JpaRepository<Teg,Integer> {
}
