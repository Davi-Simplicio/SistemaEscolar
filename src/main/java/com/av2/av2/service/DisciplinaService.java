package com.av2.av2.service;

import com.av2.av2.model.Disciplina;
import com.av2.av2.repository.DisciplinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DisciplinaService {
    private final DisciplinaRepository disciplinaRepository;


    public Disciplina buscarUm(Integer id) {
        Optional<Disciplina> disciplinaOptional = disciplinaRepository.findById(id);
        return disciplinaOptional.get();
    }

    public Collection<Disciplina> buscarTodos() {
        return disciplinaRepository.findAll();
    }

    public void deletar(Integer id) {
        disciplinaRepository.deleteById(id);
    }

    public void salvar(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }
}
