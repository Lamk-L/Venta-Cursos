package com.venta.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venta.cursos.model.DetalleVenta;
import com.venta.cursos.service.DetalleVentaService;

@RestController
@RequestMapping("/detalles-venta")
public class DetalleVentaController {
    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVenta> obtenerTodosDetallesVenta() {
        return detalleVentaService.obtenerTodosDetallesVenta();
    }

    @PostMapping
    public DetalleVenta guardarDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.guardarDetalleVenta(detalleVenta);
    }
}
