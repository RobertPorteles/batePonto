package com.robert.baterponto.company.domain.dtos.response;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
public class PontoResponse {

    private UUID id;

    private int hora;

    private int minuto;

    private int segundo;

    private Boolean fim;
}
