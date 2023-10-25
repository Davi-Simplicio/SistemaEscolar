package com.av2.av2.controller;

import com.av2.av2.model.Professor;
import com.av2.av2.service.ProfessorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    @GetMapping("/{id}")
    public Professor buscarUm(@PathVariable Integer id) {
        return professorService.buscarUm(id);
    }

    @GetMapping
    public Collection<Professor> buscarTodos() {
        return professorService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        professorService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Professor professor) {
        professorService.salvar(professor);
    }

    @PutMapping
    public void atualizar(@RequestBody  Professor professor) {
        professorService.salvar(professor);
    }
}
