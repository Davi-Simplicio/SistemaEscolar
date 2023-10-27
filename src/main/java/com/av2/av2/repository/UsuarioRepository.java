package com.av2.av2.repository;

import com.av2.av2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    public Usuario findByNomeAndSenha(String nome, String senha);
}
