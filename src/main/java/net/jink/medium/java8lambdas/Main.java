package net.jink.medium.java8lambdas;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(new Frog(), new Kangaroo(), new Fish());

        AnimalMatcher hopMatcher = (Animal animal) -> { return animal.canHop(); };
        AnimalMatcher swimMatcher = (Animal animal) -> { return animal.canSwim(); };

        for (Animal animal : animals) {
            if (hopMatcher.matches(animal)) {
                System.out.println(animal.getName() + " can hop!");
            }
            if (swimMatcher.matches(animal)) {
                System.out.println(animal.getName() + " can swim!");
            }
        }
    }
}
