package edu.ufp.esof.project_fase1.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Explicacao {

    public LocalDateTime dateBegin;

    public Cadeira nameCadeira;

    public Aluno aluno;
    public Explicador explicador;

    public LocalDateTime time() {
        return this.dateBegin.plusHours(1);
    }

}