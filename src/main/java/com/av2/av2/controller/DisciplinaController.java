package com.av2.av2.controller;

import com.av2.av2.model.Aluno;
import com.av2.av2.model.Disciplina;
import com.av2.av2.service.AlunoService;
import com.av2.av2.service.DisciplinaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {
    private final DisciplinaService disciplinaService;

    @GetMapping("/{id}")
    public Disciplina buscarUm(@PathVariable Integer id) {
        return disciplinaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Disciplina> buscarTodos() {
        return disciplinaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam("value") Integer id) {
        disciplinaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Disciplina disciplina) {
        disciplinaService.salvar(disciplina);
    }

    @PutMapping
    public void atualizar(@RequestBody  Disciplina disciplina) {
        disciplinaService.salvar(disciplina);
    }
}
