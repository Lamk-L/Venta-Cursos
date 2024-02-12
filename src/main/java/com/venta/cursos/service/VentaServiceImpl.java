package com.venta.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.cursos.model.Venta;
import com.venta.cursos.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;
    
    @Override
    public List<Venta> listarTodasLasVentas() {
        return ventaRepository.findAll();
    }

}
