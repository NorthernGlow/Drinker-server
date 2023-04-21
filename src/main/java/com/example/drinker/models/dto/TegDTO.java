package com.example.drinker.models.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TegDTO {
    private int id;
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
