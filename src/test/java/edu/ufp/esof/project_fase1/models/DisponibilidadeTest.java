package edu.ufp.esof.project_fase1.models;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DisponibilidadeTest {

    @Test
    void time() {
        Disponibilidade disponibilidade = new Disponibilidade();
        disponibilidade.dateBegin = LocalTime.of(9, 0, 0);
        disponibilidade.dateEnd = LocalTime.of(15, 0, 0);

        assertEquals(LocalTime.of(6, 0, 0), disponibilidade.time());
    }
}