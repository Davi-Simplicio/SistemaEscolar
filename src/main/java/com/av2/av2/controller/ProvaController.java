package com.av2.av2.controller;

import com.av2.av2.model.Disciplina;
import com.av2.av2.model.Prova;
import com.av2.av2.service.DisciplinaService;
import com.av2.av2.service.ProfessorService;
import com.av2.av2.service.ProvaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/prova")
public class ProvaController {
    private final ProvaService provaService;

    @GetMapping("/{id}")
    public Prova buscarUm(@PathVariable Integer id) {
        return provaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Prova> buscarTodos() {
        return provaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam("value") Integer id) {
        provaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Prova prova) {
        provaService.salvar(prova);
    }

    @PutMapping
    public void atualizar(@RequestBody  Prova prova) {
        provaService.salvar(prova);
    }
}
