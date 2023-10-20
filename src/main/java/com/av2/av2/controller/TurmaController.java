package com.av2.av2.controller;

import com.av2.av2.model.Secretario;
import com.av2.av2.model.Turma;
import com.av2.av2.service.SecretarioService;
import com.av2.av2.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/turma")
public class TurmaController {
    private final TurmaService turmaService;

    @GetMapping("/{id}")
    public Turma buscarUm(@PathVariable Integer id) {
        return turmaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Turma> buscarTodos() {
        return turmaService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        turmaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Turma turma) {
        turmaService.salvar(turma);
    }

    @PutMapping
    public void atualizar(@RequestBody  Turma turma) {
        turmaService.salvar(turma);
    }
}
