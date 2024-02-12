package com.venta.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.cursos.model.Comentario;
import com.venta.cursos.repository.ComentarioRepository;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;
    
    @Override
    public List<Comentario> listarTodosLosComentarios() {
        return comentarioRepository.findAll();
    }

}
