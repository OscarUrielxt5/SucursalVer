package com.sucursal.ordenes.repository;

import com.sucursal.ordenes.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {

    Sucursal findByNombre(String nombre);
    Sucursal findById(long id);

}
