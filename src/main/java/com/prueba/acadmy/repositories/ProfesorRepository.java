package com.prueba.acadmy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.acadmy.models.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}