package com.sucursal.ordenes.controller;

import com.sucursal.ordenes.request.SucursalRequest;
import com.sucursal.ordenes.response.SucursalResponse;
import com.sucursal.ordenes.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/vi")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping(value ="/po")
    public SucursalResponse createSucursal(@RequestBody SucursalRequest sucursalRequest) {
        return sucursalService.createSucursal(sucursalRequest);
    }
}
