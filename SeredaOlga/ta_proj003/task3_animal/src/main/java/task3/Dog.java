package task3;

public class Dog implements Animal {
    @Override
    public String voice() {
        return "barking";
    }

    @Override
    public String feed() {
        return "meat";
    }

    @Override
    public String toString(){
        return "Animal: dog\nVoice: " + voice() +
                "\nFood: " + feed() + "\n";
    }
}
