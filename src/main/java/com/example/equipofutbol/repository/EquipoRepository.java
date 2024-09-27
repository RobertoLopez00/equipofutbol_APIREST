package com.example.equipofutbol.repository;

import com.example.equipofutbol.entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}