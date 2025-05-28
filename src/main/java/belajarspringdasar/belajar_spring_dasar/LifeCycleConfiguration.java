package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import belajarspringdasar.belajar_spring_dasar.data.Connection;
import belajarspringdasar.belajar_spring_dasar.data.Server;

@Configuration
public class LifeCycleConfiguration {
    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean
    public Server server() {
        return new Server();
    }
}
