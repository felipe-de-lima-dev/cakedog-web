package br.com.cakedog.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity(name = "usuario")
@Data
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	@Column(unique = true)
	private String emailUser;
	private String senhaUser;
	private String cpfUser;
	private String nomeUser;
	private boolean isUserActive;
	private String telefoneUser;
	private LocalDate dtInativo;
	private LocalDate dtNascimento;
	private boolean tipoUser;
	@OneToMany
	private List<EnderecoUser> enderecoUser;
	@OneToMany
	private List<DadosPagamento> dadosPagamento;

}




