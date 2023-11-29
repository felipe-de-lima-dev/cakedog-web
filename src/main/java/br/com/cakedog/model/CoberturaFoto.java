package br.com.cakedog.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "cobertura_foto")
@Data
public class CoberturaFoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoberturaFoto;
    private String descricaoFoto;
    private LocalDate dtCadastro;
    private boolean isActive;
    private LocalDate dtInativo;
    private Double valorCoberturaFoto;
    @OneToMany
    private List<DetalhePedido> detalhePedido;
}
