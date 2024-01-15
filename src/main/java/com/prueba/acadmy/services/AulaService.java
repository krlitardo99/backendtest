package com.prueba.acadmy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.acadmy.models.Aula;
import com.prueba.acadmy.repositories.AulaRepository;

@Service
public class AulaService {
    @Autowired
    private AulaRepository aulaRepository;

    public Aula saveAula(Aula aula) {
        return aulaRepository.save(aula);
    }

    public List<Aula> obtenerAulas() {
        return aulaRepository.findAll();
    }

    // Otros métodos de servicio según sea necesario
};
