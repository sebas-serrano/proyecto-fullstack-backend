package uy.tilsor.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.model.Cliente;
import uy.tilsor.backend.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;

    public List<Cliente> listar() { return repo.findAll(); }
    public Cliente guardar(Cliente c) { return repo.save(c); }
    // agrega más métodos según necesites
}