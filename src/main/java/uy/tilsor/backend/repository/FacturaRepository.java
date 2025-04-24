package uy.tilsor.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.tilsor.backend.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}