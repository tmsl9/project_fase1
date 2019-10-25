package edu.ufp.esof.project_fase1.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class Disponibilidade {

  public LocalTime dateBegin;

  public LocalTime dateEnd;

  public DayOfWeek dayWeek;

    /**
   * 
   * @element-type Explicador
   */
  public Set<Explicador> explicadores = new HashSet<>();


  public LocalTime time() {
    return LocalTime.of(this.dateEnd.getHour()-this.dateBegin.getHour(), this.dateEnd.getMinute()-this.dateBegin.getMinute());
  }

}