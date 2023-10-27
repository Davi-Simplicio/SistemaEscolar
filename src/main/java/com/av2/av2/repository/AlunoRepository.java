package com.av2.av2.repository;

import com.av2.av2.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Integer> {


}
