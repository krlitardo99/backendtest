package com.prueba.acadmy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.acadmy.models.Profesor;
import com.prueba.acadmy.services.ProfesorService;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

     @GetMapping
    public List<Profesor> obtenerProfesores() {
        return profesorService.obtenerProfesores();
    }

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor) {
        return profesorService.saveProfesor(profesor);
    }

    // Otros métodos del controlador según sea necesario
};
