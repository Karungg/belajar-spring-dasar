package belajarspringdasar.belajar_spring_dasar.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String username;

    private String password;
}
