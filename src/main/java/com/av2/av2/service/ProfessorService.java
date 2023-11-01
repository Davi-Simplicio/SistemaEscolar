package com.av2.av2.service;

import com.av2.av2.model.Professor;
import com.av2.av2.model.Turma;
import com.av2.av2.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public Turma buscarUm(Integer id) {
        Optional<Turma> professorOptional = professorRepository.findById(id);
        return professorOptional.get();
    }

    public Collection<Turma> buscarTodos() {
        return professorRepository.findAll();
    }

    public void deletar(Integer id) {
//        buscarUm(id).setDisciplina(null);
        professorRepository.deleteById(id);
    }

    public void salvar(Turma professor) {
        professorRepository.save(professor);
    }
}
