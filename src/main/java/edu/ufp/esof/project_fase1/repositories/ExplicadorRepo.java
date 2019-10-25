package edu.ufp.esof.project_fase1.repositories;

import edu.ufp.esof.project_fase1.models.Explicador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExplicadorRepo extends CrudRepository<Explicador, Long> {
    Optional<Explicador> findByName(String name);
    //Optional<Explicador> findByCourseDayStartEnd();
    //Optional<Explicador> findByAll(); Já existe no CrudRepository
}
