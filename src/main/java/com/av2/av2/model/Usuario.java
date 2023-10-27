package com.av2.av2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Column(unique = true,nullable = false)
    private String nome;
    private Integer idade;
    @Column(nullable = false)
    private String senha;
    private String endereco;
}
