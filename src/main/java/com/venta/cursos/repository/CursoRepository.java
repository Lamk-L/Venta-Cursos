package com.venta.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.cursos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
