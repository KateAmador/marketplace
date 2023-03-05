package com.udev.marketplace.mapper;

import com.udev.marketplace.model.TipoUsuarios;
import com.udev.marketplace.model.Usuario;
import com.udev.marketplace.service.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class UsuarioDTOAUsuario implements IMapper<UsuarioDTO, Usuario> {

    @Override
    public Usuario map(UsuarioDTO in) {
        Usuario usuario = new Usuario();
        usuario.setNombre(in.getNombre());
        usuario.setApellido(in.getApellido());
        usuario.setTelefono(in.getTelefono());
        usuario.setEmail(in.getEmail());
        usuario.setContraseña(in.getContraseña());
        usuario.setTipoUsuario(TipoUsuarios.CLIENTE);
        //usuario.setUltimoIngreso(String.valueOf(new Date()));
        usuario.setFechaRegistro(LocalDateTime.now());
        return usuario;
    }
}
