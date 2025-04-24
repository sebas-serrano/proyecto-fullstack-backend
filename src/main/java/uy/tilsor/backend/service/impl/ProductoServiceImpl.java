package uy.tilsor.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.model.Producto;
import uy.tilsor.backend.repository.ProductoRepository;
import uy.tilsor.backend.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoRepository repo;

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public Producto guardar(Producto p) {
        return repo.save(p);
    }

}