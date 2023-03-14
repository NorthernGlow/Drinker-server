package com.example.drinker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int customerId;
//    private String customerFirstName;
//    private String customerLastName;
//    private String photo;
    private int buildingId;
    @Column(length = 4000)
    private String body;
    private int likes = 0;
    private int dislikes = 0;

    public Comment(int customerId, int buildingId, String body) {
        this.customerId = customerId;
//        this.customerFirstName = customerFirstName;
//        this.customerLastName = customerLastName;
//        this.photo = photo;
        this.buildingId = buildingId;
        this.body = body;
    }
}
