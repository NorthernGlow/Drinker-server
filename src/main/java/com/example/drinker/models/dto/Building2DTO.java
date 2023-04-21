package com.example.drinker.models.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Building2DTO {
    private int id;
    private int customerId;
    private String name;
    private String averageCheck;
    private String schedule;
    private String phone;
    private String mainPhoto;
    private String rating;

    private TegDTO teg;
    private SpecificsDTO specifics;
    private LocationDTO location;
}
