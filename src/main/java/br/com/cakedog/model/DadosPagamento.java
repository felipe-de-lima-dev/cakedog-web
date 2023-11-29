package br.com.cakedog.model;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

@Entity(name = "dados_pagamento")
@Data
public class DadosPagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDadosPagamento;
	@ManyToOne
	private Usuario usuario;
	private boolean tipoCartao;
	private String numeroCartao;
	private String nomeCartao;
	private String cvv;
	private LocalDate vencimento;

}
