package br.com.cakedog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cakedog.model.Pedidos;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long>{
	

}
