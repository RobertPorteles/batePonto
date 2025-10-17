package com.robert.baterponto.company.infrastructure.repositories;

import com.robert.baterponto.company.domain.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PontoJpaRespository extends JpaRepository<Ponto, UUID> {


}
