package net.jink.medium.java8lambdas;

@FunctionalInterface
public interface AnimalMatcher {
    boolean matches(Animal animal);
}
