package com.example.buysell.models;

import javax.persistence.*;

@Entity
@Table(name = "bilet")
public class Bilet extends Poezda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_passanger")
    private Passanger passanger;

    private double cost;

    @ManyToOne
    @JoinColumn(name = "id_poezda")
    private Poezda poezda;

    // Геттеры и сеттеры
}
