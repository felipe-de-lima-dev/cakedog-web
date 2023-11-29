package br.com.cakedog.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity(name = "formato_bolo")
@Data
public class FormatoBolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormatoBolo;
	private String descricaoForma;
	private LocalDate dtCadastro;
	private boolean isActive;
	private LocalDate dtInativo;
	private Double valorFormato;
	@OneToMany
	private List<DetalhePedido> detalhePedido;
}
