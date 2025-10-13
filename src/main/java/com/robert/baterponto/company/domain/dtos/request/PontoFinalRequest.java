package com.robert.baterponto.company.domain.dtos.request;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class PontoFinalRequest {

    private int hora;

    private int minuto;

    private int segundo;

    private Boolean fim;
}
