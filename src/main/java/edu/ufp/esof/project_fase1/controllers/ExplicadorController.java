package edu.ufp.esof.project_fase1.controllers;

import edu.ufp.esof.project_fase1.models.Explicador;
import edu.ufp.esof.project_fase1.repositories.ExplicadorRepo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/explicador")
public class ExplicadorController {
    private ExplicadorRepo explicadorRepo;

    public ExplicadorController(ExplicadorRepo explicadorRepo) {
        this.explicadorRepo = explicadorRepo;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Explicador>> getAllExplicadores(){
        return ResponseEntity.ok(this.explicadorRepo.findAll());
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Explicador>> getByName(@PathVariable("name")String explicadorName){
        return null; // ResponseEntity.ok(this.explicadorRepo.findByName(explicadorName));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Explicador> createNewExplicador(@RequestBody Explicador explicador){
        try {
            return ResponseEntity.ok(this.explicadorRepo.save(explicador));
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    //GET /explicador
    //GET /explicador/{nome_explicador}
    //GET /explicador?curso={curso}&dia={dia}&inicio={hora_inicio}&fim={hora_fim}
    //POST /explicador
    //PUT /explicador/{curso}
    //PUT /explicador (deverá ser utilizado para definir as disponibilidades do explicador)




}
