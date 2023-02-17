package com.example.drinker.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int customerId;
    private String name;
    private String averageCheck;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teg_id", referencedColumnName = "id")
//    @ToString.Exclude
    private Teg teg;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "specifics_id", referencedColumnName = "id")
//    @ToString.Exclude
    private Specifics specifics;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
//    @ToString.Exclude
    private Location location;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "photo_id")
////    @ToString.Exclude
//    private List<BuildingPhoto> photos = new ArrayList<>();

//
//
//    @JsonBackReference
//    public List<BuildingPhoto> getPhotos() {
//        return photos;
//    }
}
