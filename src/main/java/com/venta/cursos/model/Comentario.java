package com.venta.cursos.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comentario;
    private int puntuacion;
    private Date fecha_comentario;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Comentario() {
    }

    public Comentario(Long id, String comentario, int puntuacion, Date fecha_comentario) {
        this.id = id;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
        this.fecha_comentario = fecha_comentario;
    }

    public Comentario(Long id, String comentario, int puntuacion, Date fecha_comentario, Usuario usuario) {
        this.id = id;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
        this.fecha_comentario = fecha_comentario;
        this.usuario = usuario;
    }

    public Comentario(Long id, String comentario, int puntuacion, Date fecha_comentario, Usuario usuario, Curso curso) {
        this.id = id;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
        this.fecha_comentario = fecha_comentario;
        this.usuario = usuario;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFecha_comentario() {
        return fecha_comentario;
    }

    public void setFecha_comentario(Date fecha_comentario) {
        this.fecha_comentario = fecha_comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Comentario [id=" + id + ", comentario=" + comentario + ", puntuacion=" + puntuacion
                + ", fecha_comentario=" + fecha_comentario + ", usuario=" + usuario + ", curso=" + curso + "]";
    }
    
}
