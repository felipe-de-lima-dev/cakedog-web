package br.com.cakedog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cakedog.model.Pedido;
import br.com.cakedog.model.Usuario;
import br.com.cakedog.repository.PedidoRepository;
import br.com.cakedog.repository.UsuarioRepository;

import javax.transaction.Transactional;

@Controller
public class LoginController {
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	PedidoRepository pedidoRepository;

	@GetMapping("login")
	public String login() {
		return "login";
	}

	@PostMapping("efetuar-login")
	public ModelAndView doLogin(String email, String senha) {
		try {
			Usuario usuarioRetornado = usuarioRepository.findByEmailUser(email);

			if(usuarioRetornado != null && usuarioRetornado.getSenhaUser().equals(senha) && usuarioRetornado.isTipoUser()) {
				List<Pedido> pedidos = pedidoRepository.findAll();
				ModelAndView view = new ModelAndView("administrador");
				view.addObject("pedido", pedidos);
				return view;
			} else if (usuarioRetornado != null && usuarioRetornado.getSenhaUser().equals(senha) && !usuarioRetornado.isTipoUser()) {
				Usuario usuario = usuarioRepository.findByEmailUser(email);
				ModelAndView view = new ModelAndView("pagina-cliente");
				view.addObject("usuario", usuario);
				return view;
			} else {
				return new ModelAndView("login");
			}
		} catch(Exception ex) {
			return new ModelAndView("login");
		}
	}

}
