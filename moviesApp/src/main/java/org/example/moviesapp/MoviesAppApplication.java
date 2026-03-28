package org.example.moviesapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoviesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesAppApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper()
    {
        return new ModelMapper();
    }


}
