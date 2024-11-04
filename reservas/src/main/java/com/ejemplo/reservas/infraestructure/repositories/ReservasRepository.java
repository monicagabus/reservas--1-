package com.ejemplo.reservas.infraestructure.repositories;

import com.ejemplo.reservas.domain.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReservasRepository extends JpaRepository<Reservas, UUID> {
    Optional<Reservas> findByReservasId(UUID reservasId);
} 
