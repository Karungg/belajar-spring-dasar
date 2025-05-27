package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import belajarspringdasar.belajar_spring_dasar.data.Bar;
import belajarspringdasar.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    @Bean(value = "fooDepends")
    @DependsOn("barDepends")
    public Foo foo() {
        log.info("Foo depends bean created");
        return new Foo();
    }

    @Bean(value = "barDepends")
    public Bar bar() {
        log.info("Bar depends bean created");
        return new Bar();
    }
}
