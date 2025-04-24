package uy.tilsor.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.dto.FacturaDto;
import uy.tilsor.backend.mapper.FacturaMapper;
import uy.tilsor.backend.model.Factura;
import uy.tilsor.backend.repository.FacturaRepository;
import uy.tilsor.backend.service.IFacturaService;

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    private FacturaRepository repo;

    @Autowired
    private FacturaMapper mapper;

    @Override
    public List<FacturaDto> listar() {
        return mapper.toDTOList(repo.findAll());
    }

    @Override
    public FacturaDto guardar(FacturaDto dto) {
        Factura entity = mapper.toEntity(dto);
        Factura saved = repo.save(entity);
        return mapper.toDTO(saved);
    }
}