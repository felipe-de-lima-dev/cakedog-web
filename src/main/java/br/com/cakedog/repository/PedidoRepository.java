package br.com.cakedog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cakedog.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	

}
