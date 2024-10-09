package com.sucursal.ordenes.service;

import com.sucursal.ordenes.model.Orden;
import com.sucursal.ordenes.model.Producto;
import com.sucursal.ordenes.model.Sucursal;
import com.sucursal.ordenes.repository.OrdenRepository;
import com.sucursal.ordenes.repository.ProductoRepository;
import com.sucursal.ordenes.request.OrdenRequest;
import com.sucursal.ordenes.request.ProductoRequest;
import com.sucursal.ordenes.response.OrdenResponse;
import com.sucursal.ordenes.response.ProductoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private OrdenRepository ordenRepository;

    public ProductoResponse createProducto(ProductoRequest productoRequest) {
        Orden orden = ordenRepository.findById(productoRequest.getOrdenId());
        Producto producto = new Producto();
        producto.setCodigo(productoRequest.getCodigo());
        producto.setDescripcion(productoRequest.getDescripcion());
        producto.setPrecio(productoRequest.getPrecio());
        producto.setOrden(orden);
        Producto saveProducto =productoRepository.save(producto);
        ProductoResponse productoResponse = new ProductoResponse();
        productoResponse.setProductoId(saveProducto.getProductoId());
        productoResponse.setCodigo(saveProducto.getCodigo());
        productoResponse.setDescripcion(saveProducto.getDescripcion());
        productoResponse.setPrecio(saveProducto.getPrecio());
        return productoResponse;
    }


}
