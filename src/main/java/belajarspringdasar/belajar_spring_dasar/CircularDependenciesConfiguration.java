package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import belajarspringdasar.belajar_spring_dasar.cyclic.CyclicA;
import belajarspringdasar.belajar_spring_dasar.cyclic.CyclicB;
import belajarspringdasar.belajar_spring_dasar.cyclic.CyclicC;

@Configuration
public class CircularDependenciesConfiguration {
    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(@Lazy CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
