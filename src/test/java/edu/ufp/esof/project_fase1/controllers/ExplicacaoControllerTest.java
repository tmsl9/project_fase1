package edu.ufp.esof.project_fase1.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ufp.esof.project_fase1.models.Explicacao;
import edu.ufp.esof.project_fase1.repositories.ExplicacaoRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ExplicacaoController.class)
class ExplicacaoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ExplicacaoRepo explicacaoRepo;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void getAllExplicacoes() {
    }

    @Test
    void createNewExplicacao() throws Exception {
        Explicacao explicacao= new Explicacao();

        explicacao.dateBegin = LocalDateTime.of(2019, 10, 25, 10, 0, 0);

        Explicacao result=new Explicacao();

        //result.setDateBegin();1L???????ID

        when(this.explicacaoRepo.save(explicacao)).thenReturn(result);

        String response=this.mockMvc.perform(
                post("/explicacao")
                        .content(this.objectMapper.writeValueAsString(explicacao))
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
        ).andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();

        Explicacao responseExplicacao=this.objectMapper.readValue(response,Explicacao.class);

        assertEquals(responseExplicacao, result);



    }
}