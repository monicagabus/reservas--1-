package com.ejemplo.reservas.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas", schema = "reserva_schema")
public class Reservas {
    @Id
    @Column(name = "reservas_id")
    private UUID reservasId;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "tipo_comida")
    private String tipo_comida;
    
    public Reservas(UUID reservasId, String nombre, int capacidad, String tipo_comida){
        this.reservasId = reservasId;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo_comida = tipo_comida;
    }
    public Reservas(String nombre, int capacidad, String tipo_comida){
        this.reservasId = UUID.randomUUID();
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo_comida = tipo_comida;
    }
    public Reservas(){}

    public UUID getReservasId() {
        return reservasId;
    }

    public void setReservasId(UUID reservasId) {
        this.reservasId = reservasId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }
}
