package com.prueba.acadmy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.acadmy.models.Materia;
import com.prueba.acadmy.repositories.MateriaRepository;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public Materia saveMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    public List<Materia> obtenerMaterias() {
        return materiaRepository.findAll();
    }

    // Otros métodos de servicio según sea necesario
};
