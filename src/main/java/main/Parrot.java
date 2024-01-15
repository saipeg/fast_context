package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init() {
        name = "Kiki";
    }

    public void setName(String koko) {
        name = koko;
    }

    public String getName() {
        return name;
    }
}
