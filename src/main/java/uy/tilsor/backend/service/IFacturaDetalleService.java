package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.dto.FacturaDetalleDto;

public interface IFacturaDetalleService {

	 List<FacturaDetalleDto> listar();
	 
	 FacturaDetalleDto guardar(FacturaDetalleDto dto);
}