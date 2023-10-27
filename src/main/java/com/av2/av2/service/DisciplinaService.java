package com.av2.av2.service;

import com.av2.av2.model.*;
import com.av2.av2.repository.DisciplinaRepository;
import com.av2.av2.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.NoPermissionException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class DisciplinaService {
    private final DisciplinaRepository disciplinaRepository;
    private final ProfessorService professorService;
    private final ProvaService provaService;
    private final TurmaService turmaService;


    public Disciplina buscarUm(Integer id) {
        Optional<Disciplina> disciplinaOptional = disciplinaRepository.findById(id);
        return disciplinaOptional.get();
    }

    public Collection<Disciplina> buscarTodos() {
        return disciplinaRepository.findAll();
    }

    public void deletar(Integer id) {
            for (Professor professor : professorService.buscarTodos()) {
                if (professor.getDisciplina() == buscarUm(id)) {
                    professor.setDisciplina(null);
                }
            try{
                provaService.deletar(provaService.buscarPorDisciplina(id).getId());
            }catch (Exception ignored){}

            for (Turma turma:turmaService.buscarTodos()) {
                Set<Disciplina> lista = turma.getDisciplinas();
                for (Disciplina disciplina1: lista) {
                    if (disciplina1.getId().equals(id)){
                        lista.remove(disciplina1);
                        break;
                    }
                }
                turmaService.salvar(turma);
            }
            disciplinaRepository.deleteById(id);
        }
    }

    public void salvar(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }
}
