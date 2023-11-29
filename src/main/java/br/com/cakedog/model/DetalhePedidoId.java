package br.com.cakedog.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
public class DetalhePedidoId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_cobertura_foto")
    private CoberturaFoto coberturaFoto;

    @ManyToOne
    @JoinColumn(name = "id_cobertura_cor")
    private CoberturaCor coberturaCor;

    @ManyToOne
    @JoinColumn(name = "id_sabor")
    private SaborBolo saborBolo;

    @ManyToOne
    @JoinColumn(name = "id_formato_bolo")
    private FormatoBolo formatoBolo;
}
