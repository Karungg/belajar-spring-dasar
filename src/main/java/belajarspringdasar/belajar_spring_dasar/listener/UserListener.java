package belajarspringdasar.belajar_spring_dasar.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import belajarspringdasar.belajar_spring_dasar.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserListener {
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Success login for user(annotation) : " + event.getUser());
    }
}
