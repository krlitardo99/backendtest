package com.prueba.acadmy.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.acadmy.models.Aula;
import com.prueba.acadmy.services.AulaService;

@RestController
@RequestMapping("/api/aulas")
public class AulaController {
    @Autowired
    private AulaService aulaService;

    @GetMapping
    public List<Aula> obtenerAulas() {
        return aulaService.obtenerAulas();
    }

    @PostMapping
    public Aula crearAula(@RequestBody Aula aula) {
        return aulaService.saveAula(aula);
    }

   



    // Otros métodos del controlador según sea necesario
};
