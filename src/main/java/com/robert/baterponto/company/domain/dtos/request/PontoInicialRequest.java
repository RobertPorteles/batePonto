package com.robert.baterponto.company.domain.dtos.request;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PontoInicialRequest {

    private int hora;

    private int minuto;

    private int segundo;

    private int dia;

    private int mes;

    private int ano;

    private Boolean fim;
}
