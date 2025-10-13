package com.robert.baterponto.company.domain.mappers;

import com.robert.baterponto.company.domain.Ponto;

import com.robert.baterponto.company.domain.dtos.request.PontoFinalRequest;
import com.robert.baterponto.company.domain.dtos.request.PontoInicialRequest;
import com.robert.baterponto.company.domain.dtos.response.PontoResponse;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PontoMapper {


     Ponto toEntityInicio () {

         Ponto pontoEntity = new Ponto();
         PontoInicialRequest pontoInicio = new PontoInicialRequest();

         pontoInicio.setHora(LocalDateTime.now().getHour());
         pontoInicio.setMinuto(LocalDateTime.now().getMinute());
         pontoInicio.setSegundo(LocalDateTime.now().getSecond());

         pontoInicio.setFim(false);
         pontoEntity.getId();
         pontoEntity.setHora(pontoEntity.getHora());
         pontoEntity.setMinuto(pontoEntity.getMinuto());
         pontoEntity.setSegundo(pontoEntity.getSegundo());
         pontoEntity.setFim(false);

         return pontoEntity;

}


    PontoResponse toResponse(Ponto entity){
        PontoResponse response = new PontoResponse();

        response.setId(entity.getId());
        response.setHora(entity.getHora());
        response.setMinuto(entity.getMinuto());
        response.setSegundo(entity.getSegundo());
        response.setFim(entity.getFim());

        return response;
    }


}
