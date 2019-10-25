package edu.ufp.esof.project_fase1.controllers;

import edu.ufp.esof.project_fase1.models.Cadeira;
import edu.ufp.esof.project_fase1.repositories.CadeiraRepo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cadeira")
public class CadeiraController {
    private CadeiraRepo cadeiraRepo;

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)//////////////////
    public ResponseEntity<Cadeira> createNewCadeira(@RequestBody Cadeira cadeira){
        try {
            return ResponseEntity.ok(this.cadeiraRepo.save(cadeira));
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
    
    //POST /cadeira/{Curso}//////////// CADEIRA
}
