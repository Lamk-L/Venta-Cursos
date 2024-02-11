package com.venta.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venta.cursos.model.Comentario;
import com.venta.cursos.service.ComentarioService;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping
    public List<Comentario> obtenerTodosComentarios() {
        return comentarioService.obtenerTodosComentarios();
    }

    @PostMapping
    public Comentario guardarComentario(@RequestBody Comentario comentario) {
        return comentarioService.guardarComentario(comentario);
    }
}
