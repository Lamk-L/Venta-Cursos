package com.venta.cursos.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date fecha_venta;

    @Column(nullable = false, length = 10)
    private String estado;

    @Column(nullable = false)
    private double montoTotal;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detallesVenta;

    public Venta() {
    }

    public Venta(Long id, Date fecha_venta, String estado, double montoTotal) {
        this.id = id;
        this.fecha_venta = fecha_venta;
        this.estado = estado;
        this.montoTotal = montoTotal;
    }

    public Venta(Long id, Date fecha_venta, String estado, double montoTotal, Usuario usuario) {
        this.id = id;
        this.fecha_venta = fecha_venta;
        this.estado = estado;
        this.montoTotal = montoTotal;
        this.usuario = usuario;
    }

    public Venta(Long id, Date fecha_venta, String estado, double montoTotal, Usuario usuario, List<DetalleVenta> detallesVenta) {
        this.id = id;
        this.fecha_venta = fecha_venta;
        this.estado = estado;
        this.montoTotal = montoTotal;
        this.usuario = usuario;
        this.detallesVenta = detallesVenta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    @Override
    public String toString() {
        return "Venta [id=" + id + ", fecha_venta=" + fecha_venta + ", estado=" + estado + ", usuario=" + usuario
                + ", detallesVenta=" + detallesVenta + "]";
    }
    
}
