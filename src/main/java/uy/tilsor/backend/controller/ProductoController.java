package uy.tilsor.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.tilsor.backend.dto.ProductoDto;
import uy.tilsor.backend.service.IProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private IProductoService service;

    @GetMapping("/getAll")
    public List<ProductoDto> getAll() {
        return service.listar();
    }

    @PostMapping("/create")
    public ProductoDto save(@RequestBody ProductoDto dto) {
        return service.guardar(dto);
    }
}