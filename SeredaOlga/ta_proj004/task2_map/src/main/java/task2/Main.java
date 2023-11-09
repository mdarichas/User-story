package task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MapCreator mc = new MapCreator();

        mc.fillMapDefault();
        System.out.println("\n-- Before removing --");
        System.out.println(mc);

        mc.removeByName("Bran");
        System.out.println("\n-- After removing --");
        System.out.println(mc);
    }
}
