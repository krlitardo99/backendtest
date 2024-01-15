package com.prueba.acadmy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.acadmy.models.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
};