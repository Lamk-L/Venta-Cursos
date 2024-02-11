package com.venta.cursos.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private Double precio;
    private String instructor;
    private Integer duracionHoras;
    private String nivel;
    private Integer vacantesDisponibles;
    private Date fecha_registro;

    @OneToMany(mappedBy = "curso")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "curso")
    private List<DetalleVenta> detallesVenta;

    public Curso() {
    }

    public Curso(Long id, String titulo, String descripcion, Double precio, String instructor, Integer duracionHoras,
            String nivel, Integer vacantesDisponibles, Date fecha_registro) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.instructor = instructor;
        this.duracionHoras = duracionHoras;
        this.nivel = nivel;
        this.vacantesDisponibles = vacantesDisponibles;
        this.fecha_registro = fecha_registro;
    }

    public Curso(Long id, String titulo, String descripcion, Double precio, String instructor, Integer duracionHoras,
            String nivel, Integer vacantesDisponibles, Date fecha_registro, List<Comentario> comentarios) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.instructor = instructor;
        this.duracionHoras = duracionHoras;
        this.nivel = nivel;
        this.vacantesDisponibles = vacantesDisponibles;
        this.fecha_registro = fecha_registro;
        this.comentarios = comentarios;
    }

    public Curso(Long id, String titulo, String descripcion, Double precio, String instructor, Integer duracionHoras,
            String nivel, Integer vacantesDisponibles, Date fecha_registro, List<Comentario> comentarios,
            List<DetalleVenta> detallesVenta) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.instructor = instructor;
        this.duracionHoras = duracionHoras;
        this.nivel = nivel;
        this.vacantesDisponibles = vacantesDisponibles;
        this.fecha_registro = fecha_registro;
        this.comentarios = comentarios;
        this.detallesVenta = detallesVenta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Integer getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(Integer duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getVacantesDisponibles() {
        return vacantesDisponibles;
    }

    public void setVacantesDisponibles(Integer vacantesDisponibles) {
        this.vacantesDisponibles = vacantesDisponibles;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", precio=" + precio
                + ", instructor=" + instructor + ", duracionHoras=" + duracionHoras + ", nivel=" + nivel
                + ", vacantesDisponibles=" + vacantesDisponibles + ", fecha_registro=" + fecha_registro
                + ", comentarios=" + comentarios + ", detallesVenta=" + detallesVenta + "]";
    };
    
}
