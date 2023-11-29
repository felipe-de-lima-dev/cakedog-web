package br.com.cakedog.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity(name = "produto")
@Data
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	private String tipoProduto;
	private String saborProduto;
	private LocalDate dtCadastro;
	private String isActive;
	private LocalDate dtInativo;
	private Double valorProduto;

	@OneToMany
	private List<DetalhePedido> pedido;
}
	