package br.com.cakedog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.cakedog.model.DetalhePedido;
import br.com.cakedog.model.Pedido;
import br.com.cakedog.repository.DetalhePedidoRepository;
import br.com.cakedog.repository.PedidoRepository;

@Controller
public class DetalhePedidoController {

	@Autowired
	private DetalhePedidoRepository repo;
	
	@Autowired
	private PedidoRepository repositoryPedidos;
	
	@GetMapping("detalhe/{idPedido}")
	public ModelAndView detalhePedido(@PathVariable Long idPedido) {
		Pedido pedido = repositoryPedidos.findById(idPedido).get();
		DetalhePedido detalhe = repo.findByPedido(pedido);
		ModelAndView view = new ModelAndView("detalhe-de-pedidos.html");
		view.addObject("detalhe", detalhe);
		return view;
	}
}
