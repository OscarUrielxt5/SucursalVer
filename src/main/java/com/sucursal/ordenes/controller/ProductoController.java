package com.sucursal.ordenes.controller;

import com.sucursal.ordenes.repository.ProductoRepository;
import com.sucursal.ordenes.request.ProductoRequest;
import com.sucursal.ordenes.response.ProductoResponse;
import com.sucursal.ordenes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/vi")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoService productoService;

    @PostMapping(value ="/pro")
    public ProductoResponse crearProducto(@RequestBody ProductoRequest productoRequest) {
        return productoService.createProducto(productoRequest);
    }
}
