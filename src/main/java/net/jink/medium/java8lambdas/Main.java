package net.jink.medium.java8lambdas;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(new Frog(), new Kangaroo(), new Fish());

        AnimalMatcher hopMatcher = new HopMatcher();
        AnimalMatcher swimMatcher = new SwimMatcher();

        for (Animal animal : animals) {
            if (hopMatcher.matches(animal)) {
                System.out.println(animal.getName() + " can hop!");
            }
            if (swimMatcher.matches(animal)) {
                System.out.println(animal.getName() + " can swim!");
            }
        }
    }

    private static class HopMatcher implements AnimalMatcher {
        @Override
        public boolean matches(Animal animal) {
            return animal.canHop();
        }
    }

    private static class SwimMatcher implements AnimalMatcher {
        @Override
        public boolean matches(Animal animal) {
            return animal.canSwim();
        }
    }
}
