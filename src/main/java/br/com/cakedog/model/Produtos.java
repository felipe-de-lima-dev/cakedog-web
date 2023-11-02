package br.com.cakedog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produtos {
	@Id
	@GeneratedValue
	private Long idProduto;
	private String tipoProduto;
	private LocalDate dtCadastro;
	private String isActive;
	private LocalDate dtInativo;
	
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public LocalDate getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDate dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public LocalDate getDtInativo() {
		return dtInativo;
	}
	public void setDtInativo(LocalDate dtInativo) {
		this.dtInativo = dtInativo;
	}
			
	
	
	
}