package edu.ufp.esof.project_fase1.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ExplicacaoTest {

    @Test
    void time() {
        Explicacao explicacao = new Explicacao();
        explicacao.dateBegin = LocalDateTime.of(2019, 2, 12, 9, 30);

        assertEquals(LocalDateTime.of(2019, 2, 12, 10, 30), explicacao.time());
    }
}