package edu.ufp.esof.project_fase1.controllers;

import edu.ufp.esof.project_fase1.models.Explicacao;
import edu.ufp.esof.project_fase1.repositories.ExplicacaoRepo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/explicacao")
public class ExplicacaoController {
    private ExplicacaoRepo explicacaoRepo;

    public ExplicacaoController(ExplicacaoRepo explicacaoRepo) {
        this.explicacaoRepo = explicacaoRepo;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Explicacao>> getAllExplicacoes(){
        return ResponseEntity.ok(this.explicacaoRepo.findAll());
    }//GET explicacoes do proprio aluno ou do proprio explicador

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)//////////////////
    public ResponseEntity<Explicacao> createNewExplicacao(@RequestBody Explicacao explicacao){
        try {
            return ResponseEntity.ok(this.explicacaoRepo.save(explicacao));
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    //POST /explicacao
    
}
