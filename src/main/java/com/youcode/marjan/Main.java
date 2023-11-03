package com.youcode.marjan;

import com.youcode.marjan.Config.AppConfig;
import com.youcode.marjan.Models.User;
import com.youcode.marjan.Repositories.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the UserRepositoryInterface bean from the context
        UserRepository userRepository = context.getBean(UserRepository.class);

        // Create a new User entity
        User user = new User();
        user.setName("exampleUser");
        user.setEmail("example@example.com");

        // Save the User entity to the database
        userRepository.save(user);
    }
}
