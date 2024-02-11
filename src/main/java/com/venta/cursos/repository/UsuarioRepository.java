package com.venta.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.cursos.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
