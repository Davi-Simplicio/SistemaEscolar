package com.av2.av2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Prova {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private Double nota;
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Disciplina disciplina;
}
