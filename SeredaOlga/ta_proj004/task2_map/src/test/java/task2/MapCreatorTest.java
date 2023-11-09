package task2;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapCreatorTest {

    @Test
    void printMap() {
        MapCreator mc = new MapCreator();
        mc.addPerson("Clegane", "Sandor");
        mc.addPerson("Snow", "Jon");

        String expected = "\nLast name: Clegane\n" +
                "First name: Sandor\n\n" +
                "Last name: Snow\n" +
                "First name: Jon";

        String actual = mc.printMap();

        assertEquals(expected, actual);
    }
}