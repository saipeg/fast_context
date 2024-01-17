package main;

public class Parrot {

    private String name;

    public void setName(String koko) {
        name = koko;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
