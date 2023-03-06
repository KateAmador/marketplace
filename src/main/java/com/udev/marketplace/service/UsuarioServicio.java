package com.udev.marketplace.service;

import com.udev.marketplace.mapper.UsuarioDTOAUsuario;
import com.udev.marketplace.model.Usuario;
import com.udev.marketplace.repository.UsuarioRepositorio;
import com.udev.marketplace.service.dto.UsuarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    private UsuarioRepositorio repositorio;
    private UsuarioDTOAUsuario mapper;

    public UsuarioServicio(UsuarioRepositorio repositorio, UsuarioDTOAUsuario mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    public Usuario crearUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = mapper.map(usuarioDTO);
        return this.repositorio.save(usuario);
    }

    public List<Usuario> listar(){
        return this.repositorio.findAll();
    }

    public Usuario actualizarUsuario(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = repositorio.findById(id).orElseThrow(() -> new IllegalArgumentException("ID inválido"));
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setTelefono(usuarioDTO.getTelefono());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setContraseña(usuarioDTO.getContraseña());
        return repositorio.save(usuario);
    }

}
