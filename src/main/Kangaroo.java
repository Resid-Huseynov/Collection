package main;

public class Kangaroo implements Animal {
    @Override
    public String eat() {
        return "Kangaroos eat leaves and grass";
    }

    @Override
    public String move() {
        return "Kangaroo is jumping";
    }

    @Override
    public String sound() {
        return "Kangaroos sound is shhhh...";
    }

    @Override
    public String sleep() {
        return "Kangaroos dont sleep standing up";
    }
}
