package uy.tilsor.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.tilsor.backend.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> { }