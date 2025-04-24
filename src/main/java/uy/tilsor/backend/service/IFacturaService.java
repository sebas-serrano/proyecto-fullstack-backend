package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.dto.FacturaDto;

public interface IFacturaService {
	
    List<FacturaDto> listar();
    
    FacturaDto guardar(FacturaDto dto);
}