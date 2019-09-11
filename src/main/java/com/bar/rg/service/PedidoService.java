package com.bar.rg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bar.rg.domain.Pedido;
import com.bar.rg.repository.PedidoRepository;
import com.bar.rg.service.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido busca(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encotrado! Id: " + id +", Tipo: " + Pedido.class.getName()));
	}
}
