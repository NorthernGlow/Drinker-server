package com.example.drinker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class BuildingPhoto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String srcPhoto;

//    @ManyToOne(optional = false)
//    @JoinColumn(name = "building_id")
//    private Building building;

    public BuildingPhoto(String srcPhoto) {
        this.srcPhoto = srcPhoto;
    }

}
