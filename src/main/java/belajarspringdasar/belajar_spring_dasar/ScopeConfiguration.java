package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import belajarspringdasar.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean(value = "fooScope")
    @Scope("prototype")
    public Foo foo() {
        log.info("FooScope bean created");
        return new Foo();
    }

}
