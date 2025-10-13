package com.robert.baterponto.company.application;

import com.robert.baterponto.company.domain.Ponto;
import com.robert.baterponto.company.domain.dtos.request.PontoInicialRequest;
import com.robert.baterponto.company.domain.dtos.response.PontoResponse;
import com.robert.baterponto.company.domain.mappers.PontoMapper;
import com.robert.baterponto.company.domain.server.PontoServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/ponto")
@RequiredArgsConstructor
public class Controller {

    public PontoMapper pontoMapper;

    public PontoServiceImpl pontoService;

    @PostMapping()
    public ResponseEntity<PontoResponse> pontoInicial(@PathVariable UUID id, PontoInicialRequest pontoInicialRequest) {


            return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
