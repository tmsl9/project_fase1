package edu.ufp.esof.project_fase1.repositories;

import edu.ufp.esof.project_fase1.models.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepo extends CrudRepository<Aluno, Long> {
    //Optional<Aluno> findByName(String name); acho que nao ha GET de alunos
}
