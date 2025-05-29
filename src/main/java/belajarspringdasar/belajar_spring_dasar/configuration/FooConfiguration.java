package belajarspringdasar.belajar_spring_dasar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import belajarspringdasar.belajar_spring_dasar.data.Foo;

@Configuration
public class FooConfiguration {
    @Primary
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }
}
