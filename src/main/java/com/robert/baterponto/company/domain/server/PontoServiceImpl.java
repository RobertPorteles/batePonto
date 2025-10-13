package com.robert.baterponto.company.domain.server;

import com.robert.baterponto.company.domain.Ponto;

import com.robert.baterponto.company.domain.dtos.request.PontoInicialRequest;
import com.robert.baterponto.company.domain.interfaces.PontoInterface;
import com.robert.baterponto.company.domain.mappers.PontoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.UUID;
@Service
public class PontoServiceImpl implements PontoInterface {

    @Override
    public int pontoInicio() {
        // TODO Auto-generated method



        throw new UnsupportedOperationException("Unimplemented method 'pontoInicio'");
    }

    @Override
    public int pontoFim() {
        return 0;
    }


}
