package belajarspringdasar.belajar_spring_dasar.application;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

// @SpringBootApplication
public class CommandApplication {

    @Slf4j
    @Component
    public static class LogCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            log.info("Run with args: {}", Arrays.toString(args));
        }

    }
}
