package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();

        Bird bird1 = new Eagle();
        birds.add(bird1);

        Bird bird2 = new Kiwi();
        birds.add(bird2);

        Bird bird3 = new Penguin();
        birds.add(bird3);

        Bird bird4 = new Swallow();
        birds.add(bird4);

        for (Bird bird : birds){
            System.out.println(bird);
        }
    }
}