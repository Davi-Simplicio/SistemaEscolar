package com.av2.av2.service;


import com.av2.av2.model.Prova;
import com.av2.av2.repository.ProvaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProvaService {
    private final ProvaRepository provaRepository;


    public Prova buscarUm(Integer id) {
        Optional<Prova> provaOptional = provaRepository.findById(id);
        return provaOptional.get();
    }

    public Prova buscarPorDisciplina(Integer id){
        return provaRepository.findByDisciplina_Id(id);
    }
    public Collection<Prova> buscarTodos() {
        return provaRepository.findAll();
    }

    public void deletar(Integer id) {
        provaRepository.deleteById(id);
    }

    public void salvar(Prova prova) {
        provaRepository.save(prova);
    }
}
