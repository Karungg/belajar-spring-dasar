package belajarspringdasar.belajar_spring_dasar;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajarspringdasar.belajar_spring_dasar.data.Bar;
import belajarspringdasar.belajar_spring_dasar.data.Foo;
import belajarspringdasar.belajar_spring_dasar.data.FooBar;
import belajarspringdasar.belajar_spring_dasar.data.MultiFoo;

@Configuration
@Import(value = MultiFoo.class)
public class OptionalDependencyConfiguration {
    @Bean(value = "fooOptional")
    public Foo foo() {
        return new Foo();
    }

    @Bean(value = "fooBarOptional")
    public FooBar fooBar(@Qualifier("fooOptional") Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
