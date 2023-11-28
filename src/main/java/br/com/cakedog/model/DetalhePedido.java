package br.com.cakedog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DetalhePedido {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Produto produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedidos() {
		return pedido;
	}

	public void setPedidos(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProdutos() {
		return produto;
	}

	public void setProdutos(Produto produto) {
		this.produto = produto;
	}
	
	
}
