package belajarspringdasar.belajar_spring_dasar.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import belajarspringdasar.belajar_spring_dasar.data.Foo;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
    @Autowired
    Foo foo;

    @Test
    void testFoo() {
        Assertions.assertNotNull(foo);
    }
}
