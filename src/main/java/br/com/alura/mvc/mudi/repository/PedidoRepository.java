package br.com.alura.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository //isso aqui que vai me comunicar com o banco de dados
public interface PedidoRepository extends JpaRepository<Pedido, Long> { //se eu quise mais query e aqi
	
}