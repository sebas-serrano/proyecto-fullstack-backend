package uy.tilsor.backend.service;

import java.util.List;

import uy.tilsor.backend.model.FacturaDetalle;

public interface IFacturaDetalleService {

    List<FacturaDetalle> listar();

    FacturaDetalle guardar(FacturaDetalle fd);
}