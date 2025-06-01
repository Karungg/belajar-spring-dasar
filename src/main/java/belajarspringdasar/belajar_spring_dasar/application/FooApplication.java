package belajarspringdasar.belajar_spring_dasar.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import belajarspringdasar.belajar_spring_dasar.data.Foo;

// @SpringBootApplication
@Configuration
public class FooApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FooApplication.class, args);
        Foo foo = context.getBean(Foo.class);
    }

    @Bean(value = "fooApplicationAnnotation")
    public Foo foo() {
        return new Foo();
    }
}
