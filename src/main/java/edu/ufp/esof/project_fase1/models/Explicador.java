package edu.ufp.esof.project_fase1.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
public class Explicador {

  public String name;

    /**
   * 
   * @element-type Explicao
   */
  public Set<Explicacao> explicacoes = new HashSet<>();;
    /**
   * 
   * @element-type Curso
   */
  public Set<Curso> cursos = new HashSet<>();
    /**
   * 
   * @element-type Cadeira
   */
  public Set<Cadeira> cadeira = new HashSet<>();
    /**
   * 
   * @element-type Disponibilidade
   */
  public Set<Disponibilidade> disponibilidade = new HashSet<>();;

}