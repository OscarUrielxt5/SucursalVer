package com.sucursal.ordenes.controller;

import com.sucursal.ordenes.repository.OrdenRepository;
import com.sucursal.ordenes.request.OrdenRequest;
import com.sucursal.ordenes.request.SucursalRequest;
import com.sucursal.ordenes.response.OrdenResponse;
import com.sucursal.ordenes.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/orden")
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @PostMapping(value="/pon")
    public OrdenResponse createOrden(@RequestBody OrdenRequest ordenRequest) {
        return ordenService.createOrden(ordenRequest);
    }
}
