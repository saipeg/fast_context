package main;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Ella";

    private final Parrot parrot;

    public Person(Parrot parrot2) {
        parrot = parrot2;
    }


    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

}
