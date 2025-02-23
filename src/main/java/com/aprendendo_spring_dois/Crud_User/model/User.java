package com.aprendendo_spring_dois.Crud_User.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // indica que é uma entidade representando uma tabela no banco
@Table(name = "users") // define o nome da tabela para Users
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerador de identificação automatica
    private Long id;

    @Column(nullable = false) // não pode ser null
    private String name;

    @Column(nullable = false, unique = true) // não pode ser null e o e-mail é único
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
