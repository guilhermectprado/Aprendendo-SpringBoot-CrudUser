package com.aprendendo_spring_dois.Crud_User.controller;

import com.aprendendo_spring_dois.Crud_User.model.User;
import com.aprendendo_spring_dois.Crud_User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody  User user) {
        System.out.println("UserController -----------------------");
        System.out.println(user);
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
}

// RestController esta combinando as funcionalidades de @Controller e @ResponseBody.
// Simplifica a criação de Controllers Rest, onde a maioria dos métodos retorna dados diretamente no corpo da resposta (json, xml).
// Não precisa por @ResponseBody em cada metodo, pois o RestController já assume este comportamente por padrão.

// Controller
// Indica que uma classe é um controller, responsável por lidar com as requisições web e retornar uma resposta.
// Geralmente usado em conjunto com @RequestMapping para mapear URLs para métodos específicos.
// Em cenários MVC tradicionais, pode retornar uma view (página HTML) para ser renderizada.
// Um Controller não necessariamente precisa dar respostas direta a uma requisição. (redirecionamento pra outra URL, envio de e-mail, interação com serviços externos)

// ResponseBody
// Indica que o retorno de um metodo deve ser escrito diretamente no corpo da resposta HTTP, em vez de ser interpretado como uma view.
// Útil quando você precisa retornar dados estruturados (JSON, XML) para serem consumidos por outros sistemas.

// --------------------------------------------------


// API Stalles → o servidor precisa receber o token e recebe todas as informações a cada nova requisição, para fazer a funcionalidade que o cliente quer.

// API Statefull → estado de cada cliente é mantido no servidor (depende de como os dev faz, pode ser salvando IP),
// não precisa receber tokens, identificações pois o servidor já mantem o estado dele no servidor

// --------------------------------------------------

//  Injetando Service UserService, o Spring faz o new UserService por baixo dos panos
//  private UserService userService;

//  public HelloWorldController(UserService userService) {
//      this.userService = userService;
//  }

//  Denotação para o Spring injetar automaticamente o UserService
//  @Autowired



