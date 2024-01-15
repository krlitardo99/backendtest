package com.prueba.acadmy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.acadmy.models.Profesor;
import com.prueba.acadmy.repositories.ProfesorRepository;

@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor saveProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public List<Profesor> obtenerProfesores() {
        return profesorRepository.findAll();
    }

    // Otros métodos de servicio según sea necesario
};
