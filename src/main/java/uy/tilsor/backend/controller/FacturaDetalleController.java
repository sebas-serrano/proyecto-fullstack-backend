package uy.tilsor.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.tilsor.backend.dto.FacturaDetalleDto;
import uy.tilsor.backend.service.IFacturaDetalleService;

@RestController
@RequestMapping("/api/factura-detalle")
public class FacturaDetalleController {

    @Autowired
    private IFacturaDetalleService service;

    @GetMapping("/getAll")
    public List<FacturaDetalleDto> getAll() {
        return service.listar();
    }

    @PostMapping("/create")
    public FacturaDetalleDto save(@RequestBody FacturaDetalleDto dto) {
        return service.guardar(dto);
    }
}