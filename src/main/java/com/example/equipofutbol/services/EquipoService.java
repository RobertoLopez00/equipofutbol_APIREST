package com.example.equipofutbol.services;

import com.example.equipofutbol.entities.Equipo;
import com.example.equipofutbol.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> findAll() {
        return equipoRepository.findAll();
    }

    public Equipo save(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public void deleteById(Long id) {
        equipoRepository.deleteById(id);
    }

    public Equipo update(Long id, Equipo equipoDetails) {
        Equipo equipo = equipoRepository.findById(id).orElseThrow(() -> new RuntimeException("Equipo not found"));
        equipo.setNombre(equipoDetails.getNombre());
        equipo.setJugadores(equipoDetails.getJugadores());
        return equipoRepository.save(equipo);
    }
}