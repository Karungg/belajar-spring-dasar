package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import belajarspringdasar.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo1() {
        log.info("Bean foo1 created");
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        log.info("Bean foo2 created");
        return new Foo();
    }
}
