package com.example.buysell.models;

import javax.persistence.*;

@Entity
@Table(name = "poezda")
public class Poezda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Геттеры и сеттеры
}