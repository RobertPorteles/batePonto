package com.robert.baterponto.company.domain.mappers;

import com.robert.baterponto.company.domain.Ponto;
import com.robert.baterponto.company.domain.dtos.request.PontoRequest;
import com.robert.baterponto.company.domain.dtos.response.PontoResponse;


public class PontoMapper {



    Ponto toEntity(PontoRequest request){
        Ponto ponto = new Ponto();
        ponto.setId(ponto.getId());
        ponto.setInicio(request.getInicio());
        ponto.setFim(request.getFim());

    return ponto;
    }
    PontoResponse toResponse(Ponto entity){
        PontoResponse response = new PontoResponse();

        response.setId(response.getId());
        response.setInicio(response.getInicio());
        response.setFim(response.getFim());

        return response;
    }




}
