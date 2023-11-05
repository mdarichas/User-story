package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Dog dog1 = new Dog();
        animals.add(dog1);

        Cat cat1 = new Cat();
        animals.add(cat1);

        Cat cat2 = new Cat();
        animals.add(cat2);

        Dog dog2 = new Dog();
        animals.add(dog2);

        for (Animal animal : animals){
            System.out.println(animal);
        }
    }
}
