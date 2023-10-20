package com.av2.av2.controller;

import com.av2.av2.model.Turma;
import com.av2.av2.model.Usuario;
import com.av2.av2.service.TurmaService;
import com.av2.av2.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping("/{id}")
    public Usuario buscarUm(@PathVariable Integer id) {
        return usuarioService.buscarUm(id);
    }

    @GetMapping
    public Collection<Usuario> buscarTodos() {
        return usuarioService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        usuarioService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
    }

    @PutMapping
    public void atualizar(@RequestBody  Usuario usuario) {
        usuarioService.salvar(usuario);
    }
}
