package br.com.cakedog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cakedog.model.Pedidos;
import br.com.cakedog.model.Usuario;
import br.com.cakedog.repository.PedidosRepository;
import br.com.cakedog.repository.UsuarioRepository;

@Controller
public class LoginController {
	@Autowired
	UsuarioRepository repository;
	@Autowired
	PedidosRepository pedidosRepository;

	@GetMapping("login")
	public String login() {
		return "login";
	}

	@PostMapping("efetuar-login")
	public ModelAndView paginacliente(String usuario, String senha) {
		Usuario usuarioretornado = repository.findByEmail(usuario);
		

		if (usuarioretornado != null && usuarioretornado.getSenha().equals(senha)&& usuarioretornado.getTipoUsuario()==0) {
			List<Pedidos> pedidos= pedidosRepository.findAll();
			
			ModelAndView view= new ModelAndView("administrador");
			view.addObject("pedidos", pedidos);
			return view;

		} else if (usuarioretornado != null && usuarioretornado.getSenha().equals(senha)&& usuarioretornado.getTipoUsuario()==1) {
			ModelAndView view= new ModelAndView("paginacliente");
			
			return view;
		}
		
		else {
			ModelAndView view= new ModelAndView("login");
			return view;
		}
	}

}
