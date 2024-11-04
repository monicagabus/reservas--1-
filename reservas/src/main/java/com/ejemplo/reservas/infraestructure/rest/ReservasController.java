package com.ejemplo.reservas.infraestructure.rest;

import com.ejemplo.reservas.application.ReservasService;
import com.ejemplo.reservas.domain.Reservas;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;



@RestController
@RequestMapping("/reservas")
public class ReservasController {

    @Autowired
    private ReservasService reservasService;

    @PostMapping("/createReservas")
    @ResponseStatus(HttpStatus.OK)
    public Reservas createReservas (@RequestBody Reservas reservas){
        return reservasService.createReservas(reservas);
    }

    @GetMapping("/{reservasId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservas getReservas(@PathVariable String reservasId){
        return reservasService.getReservas(reservasId);
    }
    
   @DeleteMapping("/{reservasId}")
   @ResponseStatus(HttpStatus.OK)
    public void deleteReservas(@PathVariable String reservasId){
        reservasService.deleteReservas(reservasId);
    }
    @PutMapping("/{reservasId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservas updateReservas(@PathVariable String reservasId, @RequestBody Reservas reservas) {
        return reservasService.updateReservas(reservasId, reservas.getTipo_comida(), reservas.getCapacidad());
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Reservas> getAllReservas() {
        return reservasService.findAllReservas();
    }
    

}

