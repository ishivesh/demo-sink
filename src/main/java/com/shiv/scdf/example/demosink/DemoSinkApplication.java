package com.shiv.scdf.example.demosink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

@SpringBootApplication
public class DemoSinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSinkApplication.class, args);
    }

    @Bean
    public Consumer<Flux<String>> consume() {
        return stringFlux -> stringFlux
            .log()
            .subscribe();
    }
}
