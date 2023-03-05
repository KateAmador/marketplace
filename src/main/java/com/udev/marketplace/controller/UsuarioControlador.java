package com.udev.marketplace.controller;

import com.udev.marketplace.model.Usuario;
import com.udev.marketplace.service.UsuarioServicio;
import com.udev.marketplace.service.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    private final UsuarioServicio usuarioServicio;

    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return this.usuarioServicio.crearUsuario(usuarioDTO);
    }
}
