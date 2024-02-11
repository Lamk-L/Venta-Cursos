package com.venta.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.cursos.model.Curso;
import com.venta.cursos.model.DetalleVenta;
import com.venta.cursos.model.Venta;
import com.venta.cursos.repository.CursoRepository;
import com.venta.cursos.repository.DetalleVentaRepository;
import com.venta.cursos.repository.VentaRepository;

@Service
public class DetalleVentaService {
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    public List<DetalleVenta> obtenerTodosDetallesVenta() {
        return detalleVentaRepository.findAll();
    }

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private VentaRepository ventaRepository;

    public DetalleVenta guardarDetalleVenta(DetalleVenta detalleVenta) {
        DetalleVenta detalleVentaGuardado = detalleVentaRepository.save(detalleVenta);

        // Actualizar las vacantes disponibles del curso asociado al detalle de venta
        Curso curso = detalleVenta.getCurso();
        if (curso != null) {
            curso.setVacantesDisponibles(curso.getVacantesDisponibles() - 1);
            cursoRepository.save(curso);
        }

        Venta venta = detalleVenta.getVenta();
        if (venta != null) {
            // Obtener el total del detalleVenta recién guardado
            double totalDetalleVenta = detalleVenta.getTotal();

            // Actualizar el montoTotal de la venta sumando el total del detalleVenta
            double nuevoMontoTotal = venta.getMontoTotal() + totalDetalleVenta;
            venta.setMontoTotal(nuevoMontoTotal);
            ventaRepository.save(venta);
        }

        return detalleVentaGuardado;
    }
}
