package br.com.cakedog.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "pedido")
@Data
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;
	@OneToOne
	private Usuario usuario;
	private LocalDate dtPedido;
	private String isProfiActive;
	private String statusPedido;
	private double valorPedido;
	private String observacaoPedido;
	private String metodoPagamento;
	@OneToMany
	private List<DetalhePedido> detalhePedido;

}
