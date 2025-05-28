package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "belajarspringdasar.belajar_spring_dasar.repository",
        "belajarspringdasar.belajar_spring_dasar.service",
        "belajarspringdasar.belajar_spring_dasar.configuration",
})
public class ComponentConfiguration {

}
