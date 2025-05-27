package belajarspringdasar.belajar_spring_dasar;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import belajarspringdasar.belajar_spring_dasar.data.Foo;
import belajarspringdasar.belajar_spring_dasar.scope.DoubletonScope;
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

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean(value = "fooDoubleton")
    @Scope("doubleton")
    public Foo fooDooubleton() {
        log.info("Create new foo");
        return new Foo();
    }

}
