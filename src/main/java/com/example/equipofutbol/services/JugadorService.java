package com.example.equipofutbol.services;

import com.example.equipofutbol.entities.Jugador;
import com.example.equipofutbol.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    public Jugador save(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public void deleteById(Long id) {
        jugadorRepository.deleteById(id);
    }

    public Jugador update(Long id, Jugador jugadorDetails) {
        Jugador jugador = jugadorRepository.findById(id).orElseThrow(() -> new RuntimeException("Jugador not found"));
        jugador.setNombre(jugadorDetails.getNombre());
        jugador.setPosicion(jugadorDetails.getPosicion());
        jugador.setEquipo(jugadorDetails.getEquipo());
        return jugadorRepository.save(jugador);
    }
}