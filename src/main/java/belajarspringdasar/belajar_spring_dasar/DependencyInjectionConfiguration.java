package belajarspringdasar.belajar_spring_dasar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import belajarspringdasar.belajar_spring_dasar.data.Bar;
import belajarspringdasar.belajar_spring_dasar.data.Foo;
import belajarspringdasar.belajar_spring_dasar.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean(value = "fooFirstDI")
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean(value = "fooSecondDI")
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooFirstDI") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }

}
