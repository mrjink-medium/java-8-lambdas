package net.jink.medium.java8lambdas;

import java.util.function.Predicate;

@FunctionalInterface
public interface AnimalMatcher extends Predicate<Animal> {
    boolean test(Animal animal);
}
