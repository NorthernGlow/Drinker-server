package com.example.drinker.services;

import com.example.drinker.dao.SpecificsDAO;
import com.example.drinker.models.Specifics;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpecificsService {

    private SpecificsDAO specificsDAO;

    public void saveSpecifics(Specifics specifics){
        specificsDAO.save(specifics);
    }

}
