package com.av2.av2.service;

import com.av2.av2.model.Aluno;
import com.av2.av2.model.Professor;
import com.av2.av2.model.Turma;
import com.av2.av2.repository.AlunoRepository;
import com.av2.av2.repository.ProfessorRepository;
import com.av2.av2.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TurmaService {
    private final TurmaRepository turmaRepository;
    private final AlunoRepository alunoRepository;


    public Turma buscarUm(Integer id) {
        Optional<Turma> secretarioOptional = turmaRepository.findById(id);
        return secretarioOptional.get();
    }

    public Collection<Turma> buscarTodos() {
        return turmaRepository.findAll();
    }

    public void deletar(Integer id) {
        for (Aluno aluno: alunoRepository.findAll()) {
            if (aluno.getTurma()==buscarUm(id)){
                aluno.setTurma(null);
            }
        }
        turmaRepository.deleteById(id);
    }

    public void salvar(Turma turma) {
        turmaRepository.save(turma);
    }
}
