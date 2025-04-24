package uy.tilsor.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.tilsor.backend.model.FacturaDetalle;
import uy.tilsor.backend.repository.FacturaDetalleRepository;
import uy.tilsor.backend.service.IFacturaDetalleService;

@Service
public class FacturaDetalleServiceImpl implements IFacturaDetalleService {

    @Autowired
    private FacturaDetalleRepository repo;

    @Override
    public List<FacturaDetalle> listar() {
        return repo.findAll();
    }

    @Override
    public FacturaDetalle guardar(FacturaDetalle fd) {
        return repo.save(fd);
    }

}
