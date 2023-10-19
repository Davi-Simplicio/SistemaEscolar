package com.av2.av2.repository;

import com.av2.av2.model.Secretario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretarioRepository extends JpaRepository<Secretario,Integer> {
}
