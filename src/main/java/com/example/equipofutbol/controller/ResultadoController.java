package com.example.equipofutbol.controller;

import com.example.equipofutbol.entities.Resultado;
import com.example.equipofutbol.services.ResultadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultados")
public class ResultadoController {
    @Autowired
    private ResultadoService resultadoService;

    @GetMapping
    public List<Resultado> getAllResultados() {
        return resultadoService.findAll();
    }

    @PostMapping
    public Resultado createResultado(@RequestBody Resultado resultado) {
        return resultadoService.save(resultado);
    }

    @DeleteMapping("/{id}")
    public void deleteResultado(@PathVariable Long id) {
        resultadoService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Resultado updateResultado(@PathVariable Long id, @RequestBody Resultado resultadoDetails) {
        return resultadoService.update(id, resultadoDetails);
    }
}