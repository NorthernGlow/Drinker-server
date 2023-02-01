package com.example.drinker.services;

import com.example.drinker.dao.LocationDAO;
import com.example.drinker.models.Building;
import com.example.drinker.models.Location;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LocationService {

    private LocationDAO locationDAO;

    public void saveLocation(Location location) throws Exception {
        if (location != null){
            locationDAO.save(location);
        }else {
            throw new Exception();
        }
    }
}
