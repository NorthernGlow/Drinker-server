package com.example.drinker.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "location",cascade = CascadeType.ALL)
    @ToString.Exclude
    private Building building;

    private String city;
    private String region;
    private String street;
    private String buildingNumber;


}
