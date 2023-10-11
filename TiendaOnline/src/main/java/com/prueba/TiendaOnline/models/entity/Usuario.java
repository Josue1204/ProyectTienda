package com.prueba.TiendaOnline.models.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;
}
