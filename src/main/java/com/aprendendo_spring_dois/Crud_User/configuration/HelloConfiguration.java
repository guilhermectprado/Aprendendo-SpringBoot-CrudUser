package com.aprendendo_spring_dois.Crud_User.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

//    @Bean
//    public TipoClasse nomeMetodo () {
//        return new Classe();
//    }

//    @Bean
//    public SDKAWS sdkaws () {
//        return new SDKAWS();
//    }

//    @Bean
//    public TransportI transport () {
//        return new Car();
//    }

//    @Bean
//    public MyServiceI myService () {
//        return new MyServiceImpl();
//    }

}

// Por padrão é embutido o Padrão Singleton, EX: POSSO DAR UM SET NAME, SE FOR EM OUTRO ARQUIVO E DAR UM GET NAME, VAI SAIR O NOME SETADO
// ANTERIORMENTE PELO OUTRO ARQUIVO


// Toda vez que algum arquivo chamar por uma configuração, ele sempre retornará a mesma instância.

// Spring consegue gerenciar classes que são componentes do Spring, que foram mapeadas com as suas denotações.

// Configuraçoes são usados para definir bins e instancias de classes no contexto de uma aplicação Spring.

// As configurações servem para que o Spring consiga fazer injeção de classes externas (de outra biblioteca), que não estão presentes no Spring
// Ex: SDK Oracle, SDK Aws

// Se não tiver configurado o Spring não consegue injetar automaticamente a classe (Autowired).

// @Bean, é criar instancia de classe que nao pode ser gerenciado pelo Spring;