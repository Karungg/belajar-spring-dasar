package belajarspringdasar.belajar_spring_dasar.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import belajarspringdasar.belajar_spring_dasar.data.Foo;

@Configuration
public class FooConfiguration {
    @Bean(value = "fooConfig")
    public Foo foo() {
        return new Foo();
    }
}
