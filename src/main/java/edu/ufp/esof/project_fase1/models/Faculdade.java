package edu.ufp.esof.project_fase1.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Data
public class Faculdade {

  public String name;

  /**
   *
   * @element-type Curso
   */
  @OneToMany(cascade = CascadeType.ALL)
  public Set<Curso>cursos = new HashSet<>();

}