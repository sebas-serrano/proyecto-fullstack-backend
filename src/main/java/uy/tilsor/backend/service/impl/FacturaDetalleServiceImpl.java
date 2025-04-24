package uy.tilsor.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.dto.FacturaDetalleDto;
import uy.tilsor.backend.mapper.FacturaDetalleMapper;
import uy.tilsor.backend.model.FacturaDetalle;
import uy.tilsor.backend.repository.FacturaDetalleRepository;
import uy.tilsor.backend.service.IFacturaDetalleService;

@Service
public class FacturaDetalleServiceImpl implements IFacturaDetalleService {

    @Autowired
    private FacturaDetalleRepository repo;

    @Autowired
    private FacturaDetalleMapper mapper;

    @Override
    public List<FacturaDetalleDto> listar() {
        return mapper.toDTOList(repo.findAll());
    }

    @Override
    public FacturaDetalleDto guardar(FacturaDetalleDto dto) {
        FacturaDetalle entity = mapper.toEntity(dto);
        FacturaDetalle saved = repo.save(entity);
        return mapper.toDTO(saved);
    }
}
