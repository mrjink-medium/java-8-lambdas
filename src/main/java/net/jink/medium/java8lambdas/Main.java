package net.jink.medium.java8lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(new Frog(), new Kangaroo(), new Fish());

        Predicate<Animal> hopMatcher = Animal::canHop;
        Predicate<Animal> swimMatcher = Animal::canSwim;

        for (Animal animal : animals) {
            if (hopMatcher.test(animal)) {
                System.out.println(animal.getName() + " can hop!");
            }
            if (swimMatcher.test(animal)) {
                System.out.println(animal.getName() + " can swim!");
            }
        }
    }
}
