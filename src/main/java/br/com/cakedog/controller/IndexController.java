package br.com.cakedog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	// metodo que vai devolver a tela inicial

	@GetMapping("/") // o get vai pegar a rota ou a pagina
	public String home() {
		return "index";
	}

}
