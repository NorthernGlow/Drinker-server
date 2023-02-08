package com.example.drinker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int customerId;
    private String name;
    private String averageCheck;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teg_id", referencedColumnName = "id")
    private Teg teg;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "specifics_id", referencedColumnName = "id")
    private Specifics specifics;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "photo_id")
    private List<BuildingPhoto> photos = new ArrayList<>();

}
