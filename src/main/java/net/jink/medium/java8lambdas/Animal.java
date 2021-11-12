package net.jink.medium.java8lambdas;

public interface Animal {
    boolean canHop();

    boolean canSwim();

    default String getName() {
        return getClass().getSimpleName();
    }
}
