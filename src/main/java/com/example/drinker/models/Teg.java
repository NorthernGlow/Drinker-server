package com.example.drinker.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Teg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int buildingId;
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
