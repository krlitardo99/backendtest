package com.prueba.acadmy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.acadmy.models.Materia;
import com.prueba.acadmy.services.MateriaService;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> obtenerMaterias() {
        return materiaService.obtenerMaterias();
    }

    @PostMapping
    public Materia crearMateria(@RequestBody Materia materia) {
        return materiaService.saveMateria(materia);
    }

    // Otros métodos del controlador según sea necesario
};