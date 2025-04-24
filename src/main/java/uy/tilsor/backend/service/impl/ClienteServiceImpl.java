package uy.tilsor.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.model.Cliente;
import uy.tilsor.backend.repository.ClienteRepository;
import uy.tilsor.backend.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @Override
    public Cliente guardar(Cliente c) {
        return repo.save(c);
    }
	
}