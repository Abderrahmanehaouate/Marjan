package com.youcode.marjan.Config;

import com.youcode.marjan.Repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.youcode.marjan.Repositories.RepositoriesInterfaces")
@ComponentScan(basePackages = "com.youcode.marjan")
public class AppConfig {

    // Define a bean for your UserRepositoryInterface
    @Bean
    public UserRepository userRepository() {
        // Spring will automatically provide the implementation of UserRepositoryInterface
        return new UserRepository();
    }
}

