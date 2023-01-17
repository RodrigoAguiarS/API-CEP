package br.com.rodrigo.demo.models.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class FreteDto {

    private Long id;
    private double peso;
    private String cepOrigem;
    private String cepDestino;
    private String nomeDestinatario;
    private double valorTotalFrete;
    private LocalDate dataPrevistaEntrega;
    private LocalDate dataConsulta;
}
