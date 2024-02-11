package com.venta.cursos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public DetalleVenta() {
    }

    public DetalleVenta(Long id, double total) {
        this.id = id;
        this.total = total;
    }

    public DetalleVenta(Long id, double total, Venta venta) {
        this.id = id;
        this.total = total;
        this.venta = venta;
    }

    public DetalleVenta(Long id, double total, Venta venta, Curso curso) {
        this.id = id;
        this.total = total;
        this.venta = venta;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "DetalleVenta [id=" + id + ", total=" + total + ", venta=" + venta + ", curso=" + curso + "]";
    }
    
}
