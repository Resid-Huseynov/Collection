package main;

public class Dog implements Animal {

    @Override
    public String eat() {
        return "Dog eating food";
    }

    @Override
    public String move() {
        return "Dog is running";
    }

    @Override
    public String sound() {
        return "Dog is barks like hav hav";
    }

    @Override
    public String sleep() {
        return "Dog is sleeping";
    }
}
