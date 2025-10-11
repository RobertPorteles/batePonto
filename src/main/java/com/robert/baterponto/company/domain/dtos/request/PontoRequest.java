package com.robert.baterponto.company.domain.dtos.request;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PontoRequest {

    private LocalDateTime inicio;

    private LocalDateTime fim;
}
