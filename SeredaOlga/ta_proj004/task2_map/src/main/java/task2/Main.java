package task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Clegane", "Sandor");
        personMap.put("Snow", "Jon");
        personMap.put("Stark", "Bran");
        personMap.put("Baratheon", "Robert");
        personMap.put("Targaryen", "Daenerys");
        personMap.put("Builder", "Bran");
        personMap.put("Mormont", "Jorah");
        personMap.put("Greyjoy", "Theon");
        personMap.put("Drogo", "Khal");
        personMap.put("Baelish", "Petyr");

        System.out.println("\n-- Before removing --");
        for (Map.Entry<String, String> person : personMap.entrySet()){
            System.out.print("\nLast name: " + person.getKey() +
                            "\nFirst name: " + person.getValue() + "\n");
        }

        personMap.remove("Builder");
        System.out.println("\n-- After removing --");
        for (Map.Entry<String, String> person : personMap.entrySet()){
            System.out.print("\nLast name: " + person.getKey() +
                    "\nFirst name: " + person.getValue() + "\n");
        }
    }
}
