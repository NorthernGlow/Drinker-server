package com.example.drinker.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    private String schedule;
    private String phone;
    private String mainPhoto = "";
    private String rating = "0";

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teg_id", referencedColumnName = "id")
//    @ToString.Exclude
    private Teg teg;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "specifics_id", referencedColumnName = "id")
//    @ToString.Exclude
    private Specifics specifics;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
//    @ToString.Exclude
    private Location location;

//    @OneToMany(mappedBy = "building",cascade = CascadeType.ALL)
//    private List<BuildingPhoto> photos;

    public Building(int customerId, String name, String averageCheck, String schedule, String phone, Teg teg, Specifics specifics, Location location) {
        this.customerId = customerId;
        this.name = name;
        this.averageCheck = averageCheck;
        this.schedule = schedule;
        this.phone = phone;
        this.teg = teg;
        this.specifics = specifics;
        this.location = location;
    }



    //
//
//    @JsonBackReference
//    public List<BuildingPhoto> getPhotos() {
//        return photos;
//    }
}
