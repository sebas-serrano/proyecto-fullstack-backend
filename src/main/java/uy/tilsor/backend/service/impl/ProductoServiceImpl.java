package uy.tilsor.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.dto.ProductoDto;
import uy.tilsor.backend.mapper.ProductoMapper;
import uy.tilsor.backend.model.Producto;
import uy.tilsor.backend.repository.ProductoRepository;
import uy.tilsor.backend.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoRepository repo;

    @Autowired
    private ProductoMapper mapper;

    @Override
    public List<ProductoDto> listar() {
        return mapper.toDTOList(repo.findAll());
    }

    @Override
    public ProductoDto guardar(ProductoDto dto) {
        Producto entity = mapper.toEntity(dto);
        Producto saved = repo.save(entity);
        return mapper.toDTO(saved);
    }
}