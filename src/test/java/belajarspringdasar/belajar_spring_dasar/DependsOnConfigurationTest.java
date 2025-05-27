package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.data.Bar;
import belajarspringdasar.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class DependsOnConfigurationTest {
    @Test
    void testDependsOnOrder() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DependsOnConfiguration.class);
        context.refresh();

        Foo foo = (Foo) context.getBean("fooDepends");
        Bar bar = (Bar) context.getBean("barDepends");

        Assertions.assertNotNull(foo);
        Assertions.assertNotNull(bar);
    }
}
