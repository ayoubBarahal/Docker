package com.example.docker;

import org.springframework.boot.SpringApplication;

public class TestDockerApplication {

    public static void main(String[] args) {
        SpringApplication.from(DockerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
