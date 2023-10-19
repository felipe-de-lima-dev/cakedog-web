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
		return"produtos.bolosimples";
	}
	
	@GetMapping("produtos.bolospersonalizados")
	public String produtosbolospersonalizados() {
		return"produtos.bolospersonalizados";
	}
	
	@GetMapping("produtos.bolosespeciais")
	public String produtosbolosespeciais() {
		return"produtos.bolosespeciais";
	}
	

	@GetMapping("produtos.caketiscos")
	public String produtoscaketiscos() {
		return"produtos.caketiscos";
	}
	
	
	
	
	
}
