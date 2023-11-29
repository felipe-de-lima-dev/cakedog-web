package br.com.cakedog.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "cobertura_cor")
@Data
public class CoberturaCor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoberturaCor;
    private String descricaoCor;
    private LocalDate dtCadastro;
    private boolean isActive;
    private LocalDate dtInativo;
    private Double valorCoberturaCor;
    @OneToMany
    private List<DetalhePedido> detalhePedido;

}
