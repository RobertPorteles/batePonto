package com.robert.baterponto.company.domain.interfaces;

import com.robert.baterponto.company.domain.dtos.request.PontoInicialRequest;
import com.robert.baterponto.company.domain.dtos.response.PontoResponse;

import java.time.LocalDateTime;

public interface PontoInterface {

    PontoResponse registrarPontoInicio();


}