package uy.tilsor.backend.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import uy.tilsor.backend.dto.ClienteDTO;
import uy.tilsor.backend.model.Cliente;

@Component
public class ClienteMapper implements GenericMapper<Cliente, ClienteDTO> {

	@Override
	public ClienteDTO toDTO(Cliente entity) {
		ClienteDTO dto = new ClienteDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setEmail(entity.getEmail());
		return dto;
	}

	@Override
	public Cliente toEntity(ClienteDTO dto) {
		Cliente entity = new Cliente();
		entity.setId(dto.getId());
		entity.setNombre(dto.getNombre());
		entity.setEmail(dto.getEmail());
		return entity;
	}

	@Override
	public List<ClienteDTO> toDTOList(List<Cliente> entityList) {
		return entityList.stream().map(this::toDTO).collect(Collectors.toList());
	}

	@Override
	public List<Cliente> toEntityList(List<ClienteDTO> dtoList) {
		return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
	}
}
