package br.com.cakedog.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
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

	@ManyToOne
	private Endereco endereco;
	
	private int tipoUser;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getSenhaUser() {
		return senhaUser;
	}

	public void setSenhaUser(String senhaUser) {
		this.senhaUser = senhaUser;
	}

	public String getCpfUser() {
		return cpfUser;
	}

	public void setCpfUser(String cpfUser) {
		this.cpfUser = cpfUser;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public boolean isUserActive() {
		return isUserActive;
	}

	public void setUserActive(boolean isUserActive) {
		this.isUserActive = isUserActive;
	}

	public String getTelefoneUser() {
		return telefoneUser;
	}

	public void setTelefoneUser(String telefoneUser) {
		this.telefoneUser = telefoneUser;
	}

	public LocalDate getDtInativo() {
		return dtInativo;
	}

	public void setDtInativo(LocalDate dtInativo) {
		this.dtInativo = dtInativo;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(int tipoUser) {
		this.tipoUser = tipoUser;
	}
}




