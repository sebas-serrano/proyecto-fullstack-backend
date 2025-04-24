package uy.tilsor.backend.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.tilsor.backend.dto.ClienteDTO;
import uy.tilsor.backend.model.Cliente;
import uy.tilsor.backend.service.IClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private IClienteService service;

    @GetMapping
    public List<ClienteDTO> getAll() {
        return service.listar().stream().map(this::toDTO).collect(Collectors.toList());
    }

    @PostMapping
    public ClienteDTO save(@RequestBody ClienteDTO dto) {
        Cliente c = toEntity(dto);
        return toDTO(service.guardar(c));
    }

    private ClienteDTO toDTO(Cliente c) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(c.getId());
        dto.setNombre(c.getNombre());
        dto.setEmail(c.getEmail());
        return dto;
    }
    private Cliente toEntity(ClienteDTO d) {
        Cliente c = new Cliente();
        c.setId(d.getId());
        c.setNombre(d.getNombre());
        c.setEmail(d.getEmail());
        return c;
    }
}