package uy.tilsor.backend.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import uy.tilsor.backend.dto.ProductoDto;
import uy.tilsor.backend.model.Producto;
import uy.tilsor.backend.util.GenericMapper;

@Component
public class ProductoMapper implements GenericMapper<Producto, ProductoDto> {

    @Override
    public ProductoDto toDTO(Producto entity) {
        ProductoDto dto = new ProductoDto();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setPrecio(entity.getPrecio());
        return dto;
    }

    @Override
    public Producto toEntity(ProductoDto dto) {
        Producto entity = new Producto();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setPrecio(dto.getPrecio());
        return entity;
    }

    @Override
    public List<ProductoDto> toDTOList(List<Producto> entityList) {
        return entityList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Producto> toEntityList(List<ProductoDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
