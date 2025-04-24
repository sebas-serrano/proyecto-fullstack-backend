package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.dto.ClienteDTO;

public interface IClienteService {
    
	List<ClienteDTO> listar();
    
	ClienteDTO guardar(ClienteDTO dto);

}