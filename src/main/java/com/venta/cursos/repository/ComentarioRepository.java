package com.venta.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.cursos.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
