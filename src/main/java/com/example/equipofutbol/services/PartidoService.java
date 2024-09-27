package com.example.equipofutbol.services;

import com.example.equipofutbol.entities.Partido;
import com.example.equipofutbol.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {
    @Autowired
    private PartidoRepository partidoRepository;

    public List<Partido> findAll() {
        return partidoRepository.findAll();
    }

    public Partido save(Partido partido) {
        return partidoRepository.save(partido);
    }

    public void deleteById(Long id) {
        partidoRepository.deleteById(id);
    }

    public Partido update(Long id, Partido partidoDetails) {
        Partido partido = partidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Partido not found"));
        partido.setEquipoLocal(partidoDetails.getEquipoLocal());
        partido.setEquipoVisitante(partidoDetails.getEquipoVisitante());
        partido.setFecha(partidoDetails.getFecha());
        return partidoRepository.save(partido);
    }
}