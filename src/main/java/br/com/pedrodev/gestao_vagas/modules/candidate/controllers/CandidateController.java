package br.com.pedrodev.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrodev.gestao_vagas.modules.candidate.CandidateEntity;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    

    @PostMapping("/")
    public void create( @RequestBody CandidateEntity candidateEntity) {

        System.out.println(candidateEntity.getEmail());
    }
}