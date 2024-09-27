package com.example.equipofutbol.services;

import com.example.equipofutbol.entities.Resultado;
import com.example.equipofutbol.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadoService {
    @Autowired
    private ResultadoRepository resultadoRepository;

    public List<Resultado> findAll() {
        return resultadoRepository.findAll();
    }

    public Resultado save(Resultado resultado) {
        return resultadoRepository.save(resultado);
    }

    public void deleteById(Long id) {
        resultadoRepository.deleteById(id);
    }

    public Resultado update(Long id, Resultado resultadoDetails) {
        Resultado resultado = resultadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Resultado not found"));
        resultado.setGolesLocal(resultadoDetails.getGolesLocal());
        resultado.setGolesVisitante(resultadoDetails.getGolesVisitante());
        resultado.setPartido(resultadoDetails.getPartido());
        return resultadoRepository.save(resultado);
    }
}