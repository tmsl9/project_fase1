package edu.ufp.esof.project_fase1.models;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Faculdade {

  public String name;

    /**
   * 
   * @element-type Curso
   */
  public Set<Curso>cursos = new HashSet<>();

}