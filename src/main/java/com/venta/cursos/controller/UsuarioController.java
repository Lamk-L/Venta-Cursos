package com.venta.cursos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.venta.cursos.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping({"/usuarios","/"})
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarTodosLosUsuarios());
        return "usuarios";
    }
}
