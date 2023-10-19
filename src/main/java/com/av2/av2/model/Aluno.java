package com.av2.av2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno extends Usuario{
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Turma turma;
    @OneToMany(mappedBy = "aluno")
    private Set<Prova> provas;
}
