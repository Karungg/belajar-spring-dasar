package belajarspringdasar.belajar_spring_dasar.event;

import org.springframework.context.ApplicationEvent;

import belajarspringdasar.belajar_spring_dasar.data.User;
import lombok.Getter;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }

}
