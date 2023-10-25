package com.av2.av2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GeneratedColumn;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.boot.context.properties.bind.DefaultValue;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Secretario extends Usuario{
    private Integer qtdBoletins;
    private Boolean podeSerDeletado = true;
}
