package task2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapCreator {
    private Map<String, String> personMap = new LinkedHashMap<>();

    public MapCreator(){}

    public void addPerson(String lastName, String firstName){
        personMap.put(lastName, firstName);
    }

    public void removeByName(String firstName){
        personMap.values().removeIf(fN -> fN.equals(firstName));
    }

    public String getMap(){
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> person : personMap.entrySet()){
            list.add("\nLast name: " + person.getKey() +
                    "\nFirst name: " + person.getValue());
        }

        return String.join("\n", list);
    }

    public void fillMapDefault(){
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
    }

    @Override
    public String toString(){
        return getMap();
    }
}
