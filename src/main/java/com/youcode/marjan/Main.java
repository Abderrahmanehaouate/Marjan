package com.youcode.marjan;

import com.youcode.marjan.Config.AppConfig;
import com.youcode.marjan.Models.User;
import com.youcode.marjan.Repositories.UserRepository;
import com.youcode.marjan.Services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        context.getBean(UserService.class).getAllUsers();


//        // Create a Client object
//        User client = new User();
//        client.setName("John");
//        client.setEmail("abderrahmanehaouate@gmail.com");
//        client.setPassword("password123");
//
//        // Create an ApplicationContext using your AppConfig class
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        // Get the UserRepository bean from the ApplicationContext
//        UserRepository userRepository = context.getBean(UserRepository.class);
//
//        // Save the client object using the UserRepository
//        userRepository.save(client);
//
//        System.out.println("Client saved to the database successfully.");

        // Optionally, perform other operations with the saved user or other services
    }
}
