package com.example.drinker.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Specifics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "specifics",cascade = CascadeType.ALL)
    @ToString.Exclude
    private Building building;

    private boolean wifi;
    private boolean parking;
    private boolean liveMusic;
    private boolean withAnimal;


}
