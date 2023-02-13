package com.example.drinker.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Teg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "teg",cascade = CascadeType.ALL)
    @ToString.Exclude
    private Building building;

    private boolean forWedding;
    private boolean forBirthDay;
    private boolean forParty;
    private boolean forDating;
    private boolean forBaptism;
    private boolean forAnniversaries;
    private boolean forChildren;
    private boolean forFamily;
    private boolean forFriends;

}
