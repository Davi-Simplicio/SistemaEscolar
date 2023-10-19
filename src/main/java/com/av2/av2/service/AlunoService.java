package com.av2.av2.service;

import com.av2.av2.controller.AlunoController;
import com.av2.av2.model.Aluno;
import com.av2.av2.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AlunoService {
    private final AlunoRepository alunoRepository;


    public Aluno buscarUm(Integer id) {
        Optional<Aluno> carroOptional = alunoRepository.findById(id);
        return carroOptional.get();
    }

    public Collection<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    public void deletar(Integer id) {
        alunoRepository.deleteById(id);
    }

    public void salvar(Aluno carro) {
        alunoRepository.save(carro);
    }
}
