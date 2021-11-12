package net.jink.medium.java8lambdas;

public class Kangaroo implements Animal {
    @Override
    public boolean canHop() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
