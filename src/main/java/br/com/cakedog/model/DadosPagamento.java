package br.com.cakedog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "dados_pagamento")
public class DadosPagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDadosPagamento;
	private Usuario usuario;
	private boolean tipoCartao;
	private String numeroCartao;
	private String nomeCartao;
	private String cvv;
	private LocalDate vencimento;
	
	public Long getIdDadosPagamento() {
		return idDadosPagamento;
	}
	public void setIdDadosPagamento(Long idDadosPagamento) {
		this.idDadosPagamento = idDadosPagamento;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public boolean isTipoCartao() {
		return tipoCartao;
	}
	public void setTipoCartao(boolean tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public LocalDate getVencimento() {
		return vencimento;
	}
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

}
