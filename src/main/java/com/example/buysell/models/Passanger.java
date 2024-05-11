package com.example.buysell.models;

import javax.persistence.*;

@Entity
@Table(name = "passanger")
public class Passanger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_poezda")
    private Poezda poezda;

    @OneToOne(mappedBy = "passanger")
    private Bilet bilet;

    // Геттеры и сеттеры
}
