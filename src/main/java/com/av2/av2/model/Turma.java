package com.av2.av2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id",unique=true,nullable=false)
    private Integer id;
    @OneToMany(mappedBy = "turma")
    @JsonIgnore
    private Set<Aluno> alunos;
    @ManyToMany
    private Set<Disciplina> disciplinas;
}
