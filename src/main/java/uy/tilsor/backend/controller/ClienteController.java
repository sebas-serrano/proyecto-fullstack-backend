package uy.tilsor.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.tilsor.backend.dto.ClienteDTO;
import uy.tilsor.backend.service.IClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private IClienteService service;

	@GetMapping("/getAll")
	public List<ClienteDTO> getAll() {
		return service.listar();
	}

	@PostMapping("/create")
	public ClienteDTO save(@RequestBody ClienteDTO dto) {
		return service.guardar(dto);
	}

}