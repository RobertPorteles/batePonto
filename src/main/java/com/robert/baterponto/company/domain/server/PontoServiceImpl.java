package com.robert.baterponto.company.domain.server; // Idealmente, este seria '...domain.service'

import com.robert.baterponto.company.domain.Ponto;
import com.robert.baterponto.company.domain.dtos.request.PontoInicialRequest;
import com.robert.baterponto.company.domain.dtos.response.PontoResponse;
import com.robert.baterponto.company.domain.interfaces.PontoInterface;
import com.robert.baterponto.company.domain.mappers.PontoMapper;
import com.robert.baterponto.company.infrastructure.repositories.PontoJpaRespository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;

import static com.robert.baterponto.company.infrastructure.network.NtpDate.getDateTimeFromNTP;


@Service
@NoArgsConstructor
public class PontoServiceImpl implements PontoInterface {

    @Autowired
    private PontoMapper pontoMapper;
    @Autowired
    private PontoJpaRespository pontoRepository;

    @Override
    public PontoResponse registrarPontoInicio() {

        LocalDateTime ntpDate;

        try {

            // Usando a importação estática que eu adicionei acima:
            ntpDate = getDateTimeFromNTP();
        } catch (IOException e) {
            // Tratamento de Erro: Se o NTP falhar.
            throw new RuntimeException("Não foi possível registrar o ponto. Falha ao obter horário oficial.", e);
        }

        // passando os parâmetros essenciais.
        Ponto newPonto = pontoMapper.toEntityInicio(ntpDate);

        // 4. Lógica de Persistência: (Descomente quando tiver o Repository)
         Ponto savedPonto = pontoRepository.save(newPonto);

        // 5. Retorna a resposta, mapeando a entidade salva.
        return pontoMapper.toResponse(savedPonto);
    }

}