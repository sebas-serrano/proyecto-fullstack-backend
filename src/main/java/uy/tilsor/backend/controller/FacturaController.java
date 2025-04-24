package uy.tilsor.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.tilsor.backend.dto.FacturaDto;
import uy.tilsor.backend.service.IFacturaService;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private IFacturaService service;

    @GetMapping("/getAll")
    public List<FacturaDto> getAll() {
        return service.listar();
    }

    @PostMapping("/create")
    public FacturaDto save(@RequestBody FacturaDto dto) {
        return service.guardar(dto);
    }
}