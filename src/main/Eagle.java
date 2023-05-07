package main;

public class Eagle implements Animal {
    @Override
    public String eat() {
        return "Eagles eat other weak birds";
    }

    @Override
    public String move() {
        return "Eagle is flying";
    }

    @Override
    public String sound() {
        return "Eagle is whistling";
    }

    @Override
    public String sleep() {
        return "Eagles sleep 10 12 hours";
    }
}
