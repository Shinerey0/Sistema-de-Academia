package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExercicioTest {

    private Exercicio exercicio;

    @BeforeEach
    void setUp() {
        exercicio = new Exercicio(1L, "Supino", "Peito", "Barra", "Exercício de base para peito", "url_video");
    }

    @Test
    void testExercicioCreation() {
        assertNotNull(exercicio);
        assertEquals("Supino", exercicio.getNome());
        assertEquals("Peito", exercicio.getGrupoMuscular());
        assertEquals("Barra", exercicio.getEquipamento());
    }

    @Test
    void testExercicioProperties() {
        assertEquals("Exercício de base para peito", exercicio.getDescricao());
        assertEquals("url_video", exercicio.getVideoUrl());
    }
}
