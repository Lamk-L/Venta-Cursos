package com.venta.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.cursos.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {

}
