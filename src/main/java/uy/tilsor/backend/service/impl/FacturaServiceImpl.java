package uy.tilsor.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.model.Factura;
import uy.tilsor.backend.repository.FacturaRepository;
import uy.tilsor.backend.service.IFacturaService;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private FacturaRepository repo;

	@Override
	public List<Factura> listar() {
		return repo.findAll();
	}

	@Override
	public Factura guardar(Factura f) {
		return repo.save(f);
	}
	
}