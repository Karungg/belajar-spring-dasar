package belajarspringdasar.belajar_spring_dasar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import belajarspringdasar.belajar_spring_dasar.data.Bar;

@Configuration
public class BarConfiguration {
    @Bean(value = "barConfig")
    public Bar bar() {
        return new Bar();
    }
}
