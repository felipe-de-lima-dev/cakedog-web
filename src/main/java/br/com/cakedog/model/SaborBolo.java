package br.com.cakedog.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "sabor_bolo")
@Data
public class SaborBolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSabor;
    private String descricaoSabor;
    private LocalDate dtCadastro;
    private boolean isActive;
    private LocalDate dtInativo;
    private Double valorSabor;
    @OneToMany
    private List<DetalhePedido> detalhePedido;

}
