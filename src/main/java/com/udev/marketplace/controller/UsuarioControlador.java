package com.udev.marketplace.controller;

import com.udev.marketplace.model.Usuario;
import com.udev.marketplace.service.UsuarioServicio;
import com.udev.marketplace.service.dto.UsuarioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping
    public List<Usuario> listar(){
        return this.usuarioServicio.listar();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable("id") Long id) {
        return this.usuarioServicio.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable("id") Long id, @RequestBody UsuarioDTO usuarioDTO) {
        return this.usuarioServicio.actualizarUsuario(id, usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarPorId(@PathVariable("id") Long id){
        this.usuarioServicio.borrarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
