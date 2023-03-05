package com.udev.marketplace.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String contraseña;
    private TipoUsuarios tipoUsuario;
    private String ultimoIngreso;
    private LocalDateTime fechaRegistro;

}
