package com.venta.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.cursos.model.DetalleVenta;
import com.venta.cursos.repository.DetalleVentaRepository;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    private DetalleVentaRepository dVentaRepository;
    
    @Override
    public List<DetalleVenta> listarTodosLosDetalles() {
        return dVentaRepository.findAll();
    }

}
