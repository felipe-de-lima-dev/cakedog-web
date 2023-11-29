package br.com.cakedog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutosController {

	@GetMapping("produtos")
	public String produtos() {
		return"produtos";
	}
	
	@GetMapping("produtos.bolosimples")
	public String produtosbolosimples() {
		return"bolo-simples";
	}
	
	@GetMapping("produtos.bolospersonalizados")
	public String produtosbolospersonalizados() {
		return"bolos-personalizados";
	}
	
	@GetMapping("produtos.bolosespeciais")
	public String produtosbolosespeciais() {
		return"bolos-especiais";
	}

	@GetMapping("produtos.caketiscos")
	public String produtoscaketiscos() {
		return"caketiscos";
	}

}
