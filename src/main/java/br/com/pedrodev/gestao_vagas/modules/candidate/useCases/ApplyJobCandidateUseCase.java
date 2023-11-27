package br.com.pedrodev.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.pedrodev.gestao_vagas.exceptions.JobNotFoundException;
import br.com.pedrodev.gestao_vagas.exceptions.UserNotFoundException;
import br.com.pedrodev.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.pedrodev.gestao_vagas.modules.company.repositories.JobRepository;

public class ApplyJobCandidateUseCase {
   
    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;


    public void execute(UUID idCandidate, UUID idJob) {
        this.candidateRepository.findById(idCandidate)
        .orElseThrow(() -> {
            throw new UserNotFoundException();
        });

        this.jobRepository.findById(idJob)
        .orElseThrow(() -> {
            throw new JobNotFoundException();
        });
    }
}
