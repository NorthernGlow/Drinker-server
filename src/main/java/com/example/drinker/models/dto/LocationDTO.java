package com.example.drinker.models.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LocationDTO {
    private int id;
    private String city;
    private String region;
    private String street;
    private String buildingNumber;
}
