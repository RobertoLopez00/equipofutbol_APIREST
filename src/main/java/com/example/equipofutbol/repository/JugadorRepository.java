package com.example.equipofutbol.repository;

import com.example.equipofutbol.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {
}