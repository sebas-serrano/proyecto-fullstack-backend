package uy.tilsor.backend.mapper;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import uy.tilsor.backend.dto.FacturaDetalleDto;
import uy.tilsor.backend.model.FacturaDetalle;
import uy.tilsor.backend.util.GenericMapper;

@Component
public class FacturaDetalleMapper implements GenericMapper<FacturaDetalle, FacturaDetalleDto> {

    @Override
    public FacturaDetalleDto toDTO(FacturaDetalle entity) {
        FacturaDetalleDto dto = new FacturaDetalleDto();
        dto.setId(entity.getId());
        dto.setCantidad(entity.getCantidad());
        dto.setPrecioUnitario(entity.getPrecioUnitario());
        return dto;
    }

    @Override
    public FacturaDetalle toEntity(FacturaDetalleDto dto) {
        FacturaDetalle entity = new FacturaDetalle();
        entity.setId(dto.getId());
        entity.setCantidad(dto.getCantidad());
        entity.setPrecioUnitario(dto.getPrecioUnitario());
        return entity;
    }

    @Override
    public List<FacturaDetalleDto> toDTOList(List<FacturaDetalle> entityList) {
        return entityList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<FacturaDetalle> toEntityList(List<FacturaDetalleDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
