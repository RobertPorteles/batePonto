package com.robert.baterponto.company.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "hora")
    private int hora;

    @Column(name = "minuto")
    private int minuto;

    @Column(name = "segundo")
    private int segundo;

    @Column(name = "dia")
    private int dia;
    @Column(name = "mes")
    private int mes;
    @Column(name ="ano")
    private int ano;

    @Column(name = "fim")
    private Boolean fim;


}
