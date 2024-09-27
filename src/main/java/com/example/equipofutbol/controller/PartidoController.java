package com.example.equipofutbol.controller;

import com.example.equipofutbol.entities.Partido;
import com.example.equipofutbol.services.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> getAllPartidos() {
        return partidoService.findAll();
    }

    @PostMapping
    public Partido createPartido(@RequestBody Partido partido) {
        return partidoService.save(partido);
    }

    @DeleteMapping("/{id}")
    public void deletePartido(@PathVariable Long id) {
        partidoService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Partido updatePartido(@PathVariable Long id, @RequestBody Partido partidoDetails) {
        return partidoService.update(id, partidoDetails);
    }
}