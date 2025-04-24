package uy.tilsor.backend.mapper;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import uy.tilsor.backend.dto.FacturaDto;
import uy.tilsor.backend.model.Factura;
import uy.tilsor.backend.util.GenericMapper;

@Component
public class FacturaMapper implements GenericMapper<Factura, FacturaDto> {

    @Override
    public FacturaDto toDTO(Factura entity) {
        FacturaDto dto = new FacturaDto();
        dto.setId(entity.getId());
        dto.setFecha(entity.getFecha());
        dto.setTotal(entity.getTotal());
        return dto;
    }

    @Override
    public Factura toEntity(FacturaDto dto) {
        Factura entity = new Factura();
        entity.setId(dto.getId());
        entity.setFecha(dto.getFecha());
        entity.setTotal(dto.getTotal());
        return entity;
    }

    @Override
    public List<FacturaDto> toDTOList(List<Factura> entityList) {
        return entityList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Factura> toEntityList(List<FacturaDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
