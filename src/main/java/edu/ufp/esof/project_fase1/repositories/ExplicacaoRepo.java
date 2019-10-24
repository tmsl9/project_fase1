package edu.ufp.esof.project_fase1.repositories;


import edu.ufp.esof.project_fase1.models.Explicacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExplicacaoRepo extends CrudRepository<Explicacao, Long> {
    ///////Optional<Explicacao> findByName(String name);
}
