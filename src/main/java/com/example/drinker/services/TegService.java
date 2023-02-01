package com.example.drinker.services;

import com.example.drinker.dao.TegDAO;
import com.example.drinker.models.Teg;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TegService {

    private TegDAO tegDAO;

    public void saveTeg(Teg teg){
        tegDAO.save(teg);
    }

}
