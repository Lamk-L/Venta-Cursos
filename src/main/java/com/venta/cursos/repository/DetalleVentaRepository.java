package com.venta.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.cursos.model.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {

}
