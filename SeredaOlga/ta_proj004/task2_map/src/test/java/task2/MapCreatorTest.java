package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapCreatorTest {

    @Test
    void printMap() {
        MapProcessing mp = new MapProcessing();
        mp.addPerson("Clegane", "Sandor");
        mp.addPerson("Snow", "Jon");

        String expected = "\nLast name: Clegane\n" +
                "First name: Sandor\n\n" +
                "Last name: Snow\n" +
                "First name: Jon";

        String actual = mp.getMap();

        assertEquals(expected, actual);
    }
}