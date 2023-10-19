package com.av2.av2.service;

import com.av2.av2.model.Aluno;
import com.av2.av2.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AlunoService {
    private final AlunoRepository alunoRepository;


    public Aluno buscarUm(Integer id) {
        return alunoRepository.findById(id).get();
    }

    public Collection<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    public void deletar(Integer id) {
        alunoRepository.deleteById(id);
    }

    public void salvar(Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
