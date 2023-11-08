package com.av2.av2.controller;

import com.av2.av2.model.Aluno;
import com.av2.av2.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {
    private final AlunoService alunoService;

    @GetMapping("/{id}")
    public Aluno buscarUm(@PathVariable Integer id) {
        return alunoService.buscarUm(id);
    }

    @GetMapping
    public Collection<Aluno> buscarTodos() {
        return alunoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        alunoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Aluno aluno) {
        alunoService.salvar(aluno);
    }

    @PutMapping
    public void atualizar(@RequestBody  Aluno aluno) {
        alunoService.salvar(aluno);
    }
}
