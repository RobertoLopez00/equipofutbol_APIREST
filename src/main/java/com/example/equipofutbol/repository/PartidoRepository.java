package com.example.equipofutbol.repository;

import com.example.equipofutbol.entities.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidoRepository extends JpaRepository<Partido, Long> {
}