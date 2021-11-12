package net.jink.medium.java8lambdas;

public class Fish implements Animal {
    @Override
    public boolean canHop() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
