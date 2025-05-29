package belajarspringdasar.belajar_spring_dasar.data;

import org.springframework.stereotype.Component;

import belajarspringdasar.belajar_spring_dasar.aware.IdAware;
import lombok.Getter;

@Component
public class Car implements IdAware {
    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }

}
