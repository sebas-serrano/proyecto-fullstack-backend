package uy.tilsor.backend.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.dto.ClienteDTO;
import uy.tilsor.backend.model.Cliente;
import uy.tilsor.backend.repository.ClienteRepository;
import uy.tilsor.backend.service.IClienteService;
import uy.tilsor.backend.util.ClienteMapper;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository repo;

    @Autowired
    private ClienteMapper mapper;

    @Override
    public List<ClienteDTO> listar() {
        List<Cliente> clientes = repo.findAll();
        return mapper.toDTOList(clientes);
    }

    @Override
    public ClienteDTO guardar(ClienteDTO dto) {
        Cliente cliente = mapper.toEntity(dto);
        Cliente saved = repo.save(cliente);
        return mapper.toDTO(saved);
    }

}
