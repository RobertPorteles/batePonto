package com.robert.baterponto.company.infrastructure.network;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

import java.io.IOException;
import java.net.InetAddress;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class NtpDate {

    // Servidor NTP público confiável, como o do NTP.br (Brasil)
    private static final String TIME_SERVER = "a.st1.ntp.br";

    // Construtor privado para evitar que a classe utilitária seja instanciada
    private NtpDate() {
        // Nada a fazer
    }

    /**
     * Obtém a data e hora oficial do servidor NTP configurado.
     * Este método é estático para ser chamado diretamente sem instanciar a classe.
     *
     * @return LocalDateTime com o tempo oficial do servidor.
     * @throws IOException Se houver falha na comunicação com o servidor NTP (ex: timeout, host não encontrado).
     */
    public static LocalDateTime getDateTimeFromNTP() throws IOException {

        NTPUDPClient client = new NTPUDPClient();
        // Define um timeout de 10 segundos para não travar a aplicação indefinidamente
        client.setDefaultTimeout(10000);

        try {
            // Obtém o endereço IP do servidor NTP
            InetAddress inetAddress = InetAddress.getByName(TIME_SERVER);

            // Faz a requisição de tempo
            TimeInfo timeInfo = client.getTime(inetAddress);

            // Pega o tempo de recebimento do pacote (geralmente o mais confiável)
            long returnTime = timeInfo.getMessage().getReceiveTimeStamp().getTime();

            // Converte o timestamp (long) para um LocalDateTime
            // Usando o fuso horário de São Paulo para garantir o horário brasileiro
            LocalDateTime ntpDateTime = Instant.ofEpochMilli(returnTime)
                    .atZone(ZoneId.of("America/Sao_Paulo"))
                    .toLocalDateTime();

            return ntpDateTime;

        } finally {
            // É crucial fechar o cliente NTP para liberar recursos
            client.close();
        }
    }
}
