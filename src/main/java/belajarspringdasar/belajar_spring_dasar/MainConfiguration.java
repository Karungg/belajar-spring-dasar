package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajarspringdasar.belajar_spring_dasar.configuration.BarConfiguration;
import belajarspringdasar.belajar_spring_dasar.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
