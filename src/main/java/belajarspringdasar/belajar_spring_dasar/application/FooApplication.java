package belajarspringdasar.belajar_spring_dasar.application;

import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import belajarspringdasar.belajar_spring_dasar.data.Foo;
import belajarspringdasar.belajar_spring_dasar.listener.AppStartingListener;

@SpringBootApplication
public class FooApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(
                new AppStartingListener()));

        ApplicationContext context = application.run(args);
        Foo foo = context.getBean(Foo.class);

    }

    @Bean(value = "fooApplicationAnnotation")
    public Foo foo() {
        return new Foo();
    }
}
