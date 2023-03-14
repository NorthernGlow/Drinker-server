package com.example.drinker.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    @Size(min = 4)
    private String login;
    @Size(min = 8)
    private String password;

    private String photo = "";

    public Customer(String name, String surname, String email, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
