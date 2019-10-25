package edu.ufp.esof.project_fase1.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
public class Cadeira {

  public String name;

  public Curso curos;///////////////////Cada cadeira so tem um curso

    /**
   * 
   * @element-type Explicador
   */
  public Set<Explicador> explicador = new HashSet<>();

}