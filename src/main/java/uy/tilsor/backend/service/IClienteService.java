package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.model.Cliente;

public interface IClienteService {
    
	List<Cliente> listar();
    
	Cliente guardar(Cliente c);
}