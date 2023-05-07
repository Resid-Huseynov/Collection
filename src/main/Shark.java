package main;

public class Shark implements Animal {
    @Override
    public String eat() {
        return "Shark eats other fishes";
    }

    @Override
    public String move() {
        return "Shark is swimming";
    }

    @Override
    public String sound() {
        return "Shark dont have organ make sound";
    }

    @Override
    public String sleep() {
        return "Shark dont sleep,instead rest";
    }
}
