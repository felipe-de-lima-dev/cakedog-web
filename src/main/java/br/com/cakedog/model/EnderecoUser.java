package br.com.cakedog.model;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

@Entity(name = "endereco_user")
@Data
public class EnderecoUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	@ManyToOne
	private Usuario usuario;
	private String endereco;
	private String bairro;
	private String cep;
	private String cidade;
	private String estadoUf;
	private LocalDate dtCadastro;
	private String tipoEndereco;

}
