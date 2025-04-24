package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.model.Producto;

public interface IProductoService {
    
	List<Producto> listar();
    
	Producto guardar(Producto p);
}