package edu.ufp.esof.project_fase1.controllers;

import edu.ufp.esof.project_fase1.models.Faculdade;
import edu.ufp.esof.project_fase1.repositories.FaculdadeRepo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/faculdade")
public class FaculdadeController {
    private FaculdadeRepo faculdadeRepo;

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Faculdade> createNewFaculdade(@RequestBody Faculdade faculdade){
        try {
            return ResponseEntity.ok(this.faculdadeRepo.save(faculdade));
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    //POST /faculdade
}
