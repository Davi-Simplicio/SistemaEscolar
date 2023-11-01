package com.av2.av2.service;

import com.av2.av2.model.Usuario;
import com.av2.av2.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;


    public Usuario buscarUm(Integer id) {
        Optional<Usuario> secretarioOptional = usuarioRepository.findById(id);
        return secretarioOptional.get();
    }

    public Collection<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPorNomeSenha(String nome,String senha){
        Usuario usuario = usuarioRepository.findByNomeAndSenha(nome,senha);
        throw new RuntimeException("Usuario nao encontrado");
    }

    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public void salvar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
