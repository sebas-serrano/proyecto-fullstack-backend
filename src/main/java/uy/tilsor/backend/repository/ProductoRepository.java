package uy.tilsor.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.tilsor.backend.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
