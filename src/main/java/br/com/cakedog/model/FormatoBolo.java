package br.com.cakedog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "formato_bolo")
public class FormatoBolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormatoBolo;
	private String descricaoForma;
	private LocalDate dtCadastro;
	private boolean isActive;
	private LocalDate dtInativo;
	private Double valorFormato;
	
	public Long getIdFormatoBolo() {
		return idFormatoBolo;
	}
	public void setIdFormatoBolo(Long idFormatoBolo) {
		this.idFormatoBolo = idFormatoBolo;
	}
	public String getDescricaoForma() {
		return descricaoForma;
	}
	public void setDescricaoForma(String descricaoForma) {
		this.descricaoForma = descricaoForma;
	}
	public LocalDate getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public LocalDate getDtInativo() {
		return dtInativo;
	}
	public void setDtInativo(LocalDate dtInativo) {
		this.dtInativo = dtInativo;
	}
	public Double getValorFormato() {
		return valorFormato;
	}
	public void setValorFormato(Double valorFormato) {
		this.valorFormato = valorFormato;
	}

}
