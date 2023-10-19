package com.av2.av2.service;

import com.av2.av2.model.Secretario;
import com.av2.av2.model.Turma;
import com.av2.av2.repository.SecretarioRepository;
import com.av2.av2.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TurmaService {
    private final TurmaRepository turmaRepository;


    public Turma buscarUm(Integer id) {
        Optional<Turma> secretarioOptional = turmaRepository.findById(id);
        return secretarioOptional.get();
    }

    public Collection<Turma> buscarTodos() {
        return turmaRepository.findAll();
    }

    public void deletar(Integer id) {
        turmaRepository.deleteById(id);
    }

    public void salvar(Turma turma) {
        turmaRepository.save(turma);
    }
}
