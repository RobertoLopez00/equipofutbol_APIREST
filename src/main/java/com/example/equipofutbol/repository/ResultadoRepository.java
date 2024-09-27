package com.example.equipofutbol.repository;

import com.example.equipofutbol.entities.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultadoRepository extends JpaRepository<Resultado, Long> {
}