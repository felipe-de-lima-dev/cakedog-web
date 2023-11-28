package br.com.cakedog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cakedog.model.DetalhePedido;
import br.com.cakedog.model.Pedido;

@Repository
public interface DetalhePedidoRepository extends JpaRepository<DetalhePedido, Long>{

	public DetalhePedido findByPedidos(Pedido pedido);
}
