package edu.ufp.esof.project_fase1.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ufp.esof.project_fase1.models.Aluno;
import edu.ufp.esof.project_fase1.repositories.AlunoRepo;
import jdk.internal.jline.extra.EditingHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class AlunoController {
    private AlunoRepo alunoRepo;

}
