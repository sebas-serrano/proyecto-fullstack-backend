package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.model.Factura;

public interface IFacturaService {
    
	List<Factura> listar();
    
	Factura guardar(Factura f);
}