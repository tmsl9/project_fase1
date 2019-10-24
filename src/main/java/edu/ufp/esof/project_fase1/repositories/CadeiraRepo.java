package edu.ufp.esof.project_fase1.repositories;

import edu.ufp.esof.project_fase1.models.Cadeira;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadeiraRepo extends CrudRepository<Cadeira, Long> {
    //Optional<Cadeira> findByName(String name); acho que nao ha GET de cadeiras
}
