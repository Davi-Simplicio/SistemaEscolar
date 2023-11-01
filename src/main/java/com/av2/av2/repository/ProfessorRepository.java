package com.av2.av2.repository;

import com.av2.av2.model.Professor;
import com.av2.av2.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Turma,Integer> {
}
