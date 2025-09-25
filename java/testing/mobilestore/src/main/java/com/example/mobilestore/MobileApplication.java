package com.example.mobilestore;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MobileApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileApplication.class, args);
    }

    // Bean for DTO mapping
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
