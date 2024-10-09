package com.sucursal.ordenes.service;

import com.sucursal.ordenes.model.Orden;
import com.sucursal.ordenes.model.Sucursal;
import com.sucursal.ordenes.repository.OrdenRepository;
import com.sucursal.ordenes.repository.ProductoRepository;
import com.sucursal.ordenes.repository.SucursalRepository;
import com.sucursal.ordenes.request.OrdenRequest;
import com.sucursal.ordenes.response.OrdenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private SucursalRepository sucursalRepository;

    public OrdenResponse createOrden(OrdenRequest ordenRequest) {
        Sucursal sucursal = sucursalRepository.findById(ordenRequest.getSucursalId());
        Orden orden = new Orden();
        orden.setFecha(LocalDate.now());
        orden.setTotal(ordenRequest.getTotal());
        orden.setSucursal(sucursal);
        Orden savedOrden = ordenRepository.save(orden);
        OrdenResponse ordenResponse = new OrdenResponse();
        ordenResponse.setOrdenId(savedOrden.getOrdenId());
        ordenResponse.setFecha(savedOrden.getFecha());
        ordenResponse.setTotal(savedOrden.getTotal());
        return ordenResponse;
    }
}
