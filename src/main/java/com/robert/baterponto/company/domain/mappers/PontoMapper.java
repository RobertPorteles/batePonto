package com.robert.baterponto.company.domain.mappers;
import com.robert.baterponto.company.domain.Ponto;
import com.robert.baterponto.company.domain.dtos.response.PontoResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
public class PontoMapper {

     public Ponto toEntityInicio(LocalDateTime ntpDate) {

         Ponto pontoEntity = new Ponto();

         // Mapeia os componentes de data/hora do servidor
         pontoEntity.setHora(ntpDate.getHour());
         pontoEntity.setMinuto(ntpDate.getMinute());
         pontoEntity.setSegundo(ntpDate.getSecond());
         pontoEntity.setDia(ntpDate.getDayOfMonth());
         pontoEntity.setMes(ntpDate.getMonthValue());
         pontoEntity.setAno(ntpDate.getYear());

         // Define o indicador de ponto de INÍCIO
         pontoEntity.setFim(false);

         return pontoEntity;

}


    public PontoResponse toResponse(Ponto entity){
        PontoResponse response = new PontoResponse();

        response.setId(entity.getId());


        response.setHora(entity.getHora());
        response.setMinuto(entity.getMinuto());
        response.setSegundo(entity.getSegundo());
        response.setDia(entity.getDia());
        response.setMes(entity.getMes());
        response.setAno(entity.getAno());

        response.setFim(entity.getFim());

        return response;
    }


}
