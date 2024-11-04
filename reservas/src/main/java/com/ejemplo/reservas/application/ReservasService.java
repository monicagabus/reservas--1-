package com.ejemplo.reservas.application;


import java.util.Optional;
import java.util.UUID;
import java.util.List;


import javax.inject.Inject;

import org.springframework.stereotype.Component;
import com.ejemplo.reservas.domain.Reservas;
import com.ejemplo.reservas.infraestructure.repositories.ReservasRepository;

@Component
public class ReservasService {
    
    private final ReservasRepository reservasRepository;

    @Inject
    public ReservasService(ReservasRepository reservasRepository){
        this.reservasRepository = reservasRepository;
    }

    public List<Reservas> findAllReservas() {
        return reservasRepository.findAll();
    }
    

    public Reservas createReservas(Reservas reservas){
        return reservasRepository.save(reservas);
    }
    public Reservas getReservas(String id){
        UUID reservasId = UUID.fromString(id);
        Optional<Reservas> reservasOptional = reservasRepository.findByReservasId(reservasId);
        if(!reservasOptional.isPresent()){
            throw new RuntimeException();
        }
        return reservasOptional.get();
    }
    public Reservas updateReservas(String id, String newTipo_comida, int newCapacidad){
        Reservas reservas = getReservas(id);
        reservas.setTipo_comida(newTipo_comida);
        reservas.setCapacidad(newCapacidad);
        return reservasRepository.save(reservas);
    }

    public void deleteReservas(String id){
        Reservas reservas = getReservas(id);
        reservasRepository.delete(reservas);
    }

}
