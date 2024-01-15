package com.prueba.acadmy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.acadmy.models.Aula;

public interface AulaRepository extends JpaRepository<Aula, Long> {
};