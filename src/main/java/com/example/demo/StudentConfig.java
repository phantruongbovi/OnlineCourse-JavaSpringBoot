package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student truong = new Student(
                    "Truong",
                    "phantruongdp@gmail.com",
                    LocalDate.of(1983, 3, 5)
            );

            Student quoc = new Student(
                    "Truong Con",
                    "phantruongdp@gmail.com",
                    LocalDate.of(1973, 3, 5)
            );

            studentRepository.saveAll(List.of(
                    truong,
                    quoc
            ));
        };
    }
}
