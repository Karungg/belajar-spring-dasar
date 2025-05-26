package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import belajarspringdasar.belajar_spring_dasar.data.Foo;

@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        return foo;
    }
}
