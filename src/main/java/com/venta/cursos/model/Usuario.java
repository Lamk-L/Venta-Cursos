package com.venta.cursos.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "correo_electronico", nullable = false, length = 35)
    private String correoElectronico;
    
    @Column(nullable = false, length = 20)
    private String contrasena;

    @Column(nullable = false)
    private Date fecha_registro;

    @OneToMany(mappedBy = "usuario")
    private List<Venta> ventas;

    public Usuario() {
    }

    public Usuario(String nombre, String correoElectronico, String contrasena, Date fecha_registro) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.fecha_registro = fecha_registro;
    }

    public Usuario(Long id, String nombre, String correoElectronico, String contrasena, Date fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.fecha_registro = fecha_registro;
    }

    public Usuario(Long id, String nombre, String correoElectronico, String contrasena, Date fecha_registro,
            List<Venta> ventas) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.fecha_registro = fecha_registro;
        this.ventas = ventas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", contrasena="
                + contrasena + ", fecha_registro=" + fecha_registro + ", ventas=" + ventas + "]";
    }
    
}
