package com.sucursal.ordenes.service;

import com.sucursal.ordenes.model.Sucursal;
import com.sucursal.ordenes.repository.SucursalRepository;
import com.sucursal.ordenes.request.SucursalRequest;
import com.sucursal.ordenes.response.SucursalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    public SucursalResponse createSucursal(SucursalRequest sucursalRequest) {
        Sucursal sucursal = new Sucursal();
        sucursal.setNombre(sucursalRequest.getNombre());
        Sucursal savedSucursal = sucursalRepository.save(sucursal);
        SucursalResponse sucursalResponse = new SucursalResponse();
        sucursalResponse.setSucursalId(savedSucursal.getSucursalId());
        sucursalResponse.setNombre(savedSucursal.getNombre());
        return sucursalResponse;
    }
}
