package com.aprendendo_spring_dois.Crud_User.repository;

import com.aprendendo_spring_dois.Crud_User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

// Apenas isso já permite usar os métodos save(). findAll(), findById(), deleteById()
// Sem implementar manualmente.