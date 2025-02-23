package com.aprendendo_spring_dois.Crud_User.service;

import com.aprendendo_spring_dois.Crud_User.model.User;
import com.aprendendo_spring_dois.Crud_User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        System.out.println("UserService -----------------------");
        System.out.println(user);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}

// Geralmente contém a lógica da aplicação, as regras de negócio, definidas pelos PO, chefes, geralmente concentradas nas classes de Services.

// Controller, só recebe requisição e passa o trabalho lógico para Service.

// Na Service é onde se faz o acesso aos repository, as classes de conexao ao banco de dados e demais processamentos.