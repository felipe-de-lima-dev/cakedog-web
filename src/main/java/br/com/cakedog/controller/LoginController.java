package br.com.cakedog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.cakedog.model.Usuario;
import br.com.cakedog.repository.UsuarioRepository;

@Controller
public class LoginController {
	@Autowired
	UsuarioRepository repository;

	@GetMapping("login")
	public String login() {
		return "login";
	}

	@PostMapping("paginacliente")
	public String paginacliente(String usuario, String senha) {
		Usuario usuarioretornado = repository.findByEmail(usuario);

		if (usuarioretornado != null && usuarioretornado.getSenha().equals(senha)) {
			return "paginacliente";

		} else {
			return "login";
		}
	}

}
