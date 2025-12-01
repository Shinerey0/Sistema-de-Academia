package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusFicha;

class FichaTreinoTest {

    private FichaTreino ficha;
    private Aluno aluno;
    private Professor professor;

    @BeforeEach
    void setUp() {
        aluno = new Aluno();
        aluno.setId(1L);
        
        professor = new Professor();
        professor.setId(1L);
        
        ficha = new FichaTreino(1L, aluno, professor, LocalDate.now(), 
                               LocalDate.now().plusMonths(1), StatusFicha.ATIVA);
    }

    @Test
    void testFichaTreinoCreation() {
        assertNotNull(ficha);
        assertEquals(StatusFicha.ATIVA, ficha.getStatus());
        assertEquals(aluno, ficha.getAluno());
        assertEquals(professor, ficha.getProfessor());
    }

    @Test
    void testAtivarFicha() {
        ficha.setStatus(StatusFicha.INATIVA);
        ficha.ativar();
        
        assertEquals(StatusFicha.ATIVA, ficha.getStatus());
    }

    @Test
    void testInativarFicha() {
        ficha.inativar();
        
        assertEquals(StatusFicha.INATIVA, ficha.getStatus());
    }

    @Test
    void testAdicionarExercicio() {
        Exercicio exercicio = new Exercicio(1L, "Supino", "Peito", "Halteres", "Exercício básico", "url_video");
        ExercicioFicha exercicioFicha = new ExercicioFicha(1L, exercicio, 1, 4, "10-8-6-4", null, "Com pausa");
        
        ficha.getExercicios().add(exercicioFicha);
        
        assertEquals(1, ficha.getExercicios().size());
        assertEquals(exercicio, ficha.getExercicios().get(0).getExercicio());
    }
}
