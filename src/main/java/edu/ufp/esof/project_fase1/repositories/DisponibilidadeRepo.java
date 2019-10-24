package edu.ufp.esof.project_fase1.repositories;

import edu.ufp.esof.project_fase1.models.Disponibilidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DisponibilidadeRepo extends CrudRepository<Disponibilidade, Long> {
    ///////////Optional<Disponibilidade> findByName(String name);
}
