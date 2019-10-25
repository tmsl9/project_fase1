package edu.ufp.esof.project_fase1.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Data
public class Curso {

  public String name;

    /**
   * 
   * @element-type Aluno
   */
  public Set<Aluno>  alunos = new HashSet<>();
    /**
   * 
   * @element-type Cadeira
   */
  public Set<Explicador>  explicadores = new HashSet<>();
    /**
   * 
   * @element-type Cadeira
   */
    @OneToMany(cascade = CascadeType.ALL)
  public Set<Cadeira> cadeiras = new HashSet<>();
    public Faculdade faculdade;

}