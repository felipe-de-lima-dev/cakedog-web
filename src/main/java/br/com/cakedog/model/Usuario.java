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
	private Long id;
	@Column(unique = true)
	private String email;
	private String senha;
	private String cpf;
	private String nome;
	private boolean isClienteActive;
	private String telefone;
	private LocalDate dataInativo;
	private LocalDate dtNascimento;

	@ManyToOne
	private Endereco endereco;
	
	private int tipoUsuario;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isClienteActive() {
		return isClienteActive;
	}
	public void setClienteActive(boolean isClienteActive) {
		this.isClienteActive = isClienteActive;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getDataInativo() {
		return dataInativo;
	}
	public void setDataInativo(LocalDate dataInativo) {
		this.dataInativo = dataInativo;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public int getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}




