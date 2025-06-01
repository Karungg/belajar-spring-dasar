package belajarspringdasar.belajar_spring_dasar.application;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class RunnerApplication {

    @Slf4j
    @Component
    public static class SimpleRunner implements ApplicationRunner {
        @Override
        public void run(ApplicationArguments args) throws Exception {
            List<String> profiles = args.getOptionValues("profiles");
            log.info("Profiles {}", profiles);
        }
    }
}
