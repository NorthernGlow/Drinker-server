package com.example.drinker.models.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SpecificsDTO {
    private int id;
    private boolean wifi;
    private boolean parking;
    private boolean liveMusic;
    private boolean withAnimal;
}
