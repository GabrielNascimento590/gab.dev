package com.exemple.cadastros.de.usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Anotações

@Entity
@Table (name = "Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long id;
    private String nome;
    private String email;
    private Integer idade;

}
