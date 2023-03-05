package com.udev.marketplace.service.dto;

import lombok.Data;

@Data
public class UsuarioDTO {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String contraseña;
}
