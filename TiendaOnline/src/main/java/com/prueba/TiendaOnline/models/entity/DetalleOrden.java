package com.prueba.TiendaOnline.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "detalles_de_ordenes")
public class DetalleOrden {
    private Long id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;
}
