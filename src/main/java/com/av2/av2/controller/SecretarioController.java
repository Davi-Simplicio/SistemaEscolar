package com.av2.av2.controller;

import com.av2.av2.model.Secretario;
import com.av2.av2.service.SecretarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.naming.NoPermissionException;
import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/secretario")
public class SecretarioController {
    private final SecretarioService secretarioService;

    @GetMapping("/{id}")
    public Secretario buscarUm(@PathVariable Integer id) {
        return secretarioService.buscarUm(id);
    }

    @GetMapping
    public Collection<Secretario> buscarTodos() {
        return secretarioService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) throws NoPermissionException {
        secretarioService.deletar(id);
    }

    @PostMapping
    public void inserir(@PathVariable Secretario secretario) {
        secretarioService.salvar(secretario);
    }

    @PutMapping
    public void atualizar(@RequestBody  Secretario secretario) {
        secretarioService.salvar(secretario);
    }
}
