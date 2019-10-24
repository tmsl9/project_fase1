package edu.ufp.esof.project_fase1.repositories;

        import edu.ufp.esof.project_fase1.models.Faculdade;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import java.util.Optional;

@Repository
public interface FaculdadeRepo  extends CrudRepository<Faculdade, Long> {
    //Optional<Faculdade> findByName(String name); acho que nao ha GET de faculdade
}
