package br.com.cakedog.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pedidos {

	@Id
	@GeneratedValue
	private Long idPedido;
	@OneToOne
	private Usuario usuario;
	private LocalDate dtPedido;
	private String isProfiActive;
	private String statusPedido;
	private double valorPedido;
	private String observacaoPedido;
	
	@OneToMany
	private List<Produtos> produtos;
	
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public LocalDate getDtPedido() {
		return dtPedido;
	}
	public void setDtPedido(LocalDate dtPedido) {
		this.dtPedido = dtPedido;
	}
	public String getIsProfiActive() {
		return isProfiActive;
	}
	public void setIsProfiActive(String isProfiActive) {
		this.isProfiActive = isProfiActive;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	public double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	public String getObservacaoPedido() {
		return observacaoPedido;
	}
	public void setObservacaoPedido(String observacaoPedido) {
		this.observacaoPedido = observacaoPedido;
	}
	public List<Produtos> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
}
