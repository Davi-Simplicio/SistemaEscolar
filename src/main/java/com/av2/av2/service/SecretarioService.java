package com.av2.av2.service;

import com.av2.av2.model.Secretario;
import com.av2.av2.repository.SecretarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.NoPermissionException;
import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SecretarioService {
    private final SecretarioRepository secretarioRepository;


    public Secretario buscarUm(Integer id) {
        Optional<Secretario> secretarioOptional = secretarioRepository.findById(id);
        return secretarioOptional.get();
    }

    public Collection<Secretario> buscarTodos() {
        return secretarioRepository.findAll();
    }

    public void deletar(Integer id) throws NoPermissionException {
//        if (buscarUm(id).getPodeSerDeletado()){
            secretarioRepository.deleteById(id);
//        }else{
//            throw new NoPermissionException();
//        }
    }

    public void salvar(Secretario secretario) {
        secretarioRepository.save(secretario);
    }
}
