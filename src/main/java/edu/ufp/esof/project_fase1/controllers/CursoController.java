package edu.ufp.esof.project_fase1.controllers;

import edu.ufp.esof.project_fase1.models.Curso;
import edu.ufp.esof.project_fase1.repositories.CursoRepo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/curso")
public class CursoController {
    private CursoRepo cursoRepo;

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)//////////////////
    public ResponseEntity<Curso> createNewCurso(@RequestBody Curso curso){
        try {
            return ResponseEntity.ok(this.cursoRepo.save(curso));
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
    
    //POST /curso/{faculdade}????????????? FACULDADE
}
