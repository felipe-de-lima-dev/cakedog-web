package br.com.cakedog.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "detalhe_pedido")
@Data
public class DetalhePedido {

	@EmbeddedId
	private DetalhePedidoId id;

	@ManyToOne
	@JoinColumn(name = "id_pedido", insertable = false, updatable = false)
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name = "id_produto", insertable = false, updatable = false)
	private Produto produto;

	@ManyToOne
	@JoinColumn(name = "id_cobertura_foto", insertable = false, updatable = false)
	private CoberturaFoto coberturaFoto;

	@ManyToOne
	@JoinColumn(name = "id_cobertura_cor", insertable = false, updatable = false)
	private CoberturaCor coberturaCor;

	@ManyToOne
	@JoinColumn(name = "id_sabor", insertable = false, updatable = false)
	private SaborBolo saborBolo;

	@ManyToOne
	@JoinColumn(name = "id_formato_bolo", insertable = false, updatable = false)
	private FormatoBolo formatoBolo;

}
