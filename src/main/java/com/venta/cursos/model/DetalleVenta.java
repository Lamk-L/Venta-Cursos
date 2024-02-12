package com.venta.cursos.model;

import jakarta.persistence.Column;
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
    
    @Column(nullable = false)
    private double precio;

    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Curso curso;

    public DetalleVenta() {
    }

    public DetalleVenta(Long id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public DetalleVenta(Long id, double precio, Venta venta) {
        this.id = id;
        this.precio = precio;
        this.venta = venta;
    }

    public DetalleVenta(Long id, double precio, Venta venta, Curso curso) {
        this.id = id;
        this.precio = precio;
        this.venta = venta;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
        return "DetalleVenta [id=" + id + ", precio=" + precio + ", venta=" + venta + ", curso=" + curso + "]";
    }
    
}
