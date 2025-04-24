package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.dto.ProductoDto;


public interface IProductoService {
    
	List<ProductoDto> listar();
    
	ProductoDto guardar(ProductoDto dto);
}