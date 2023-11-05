package task3;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "meow meow meow";
    }

    @Override
    public String feed() {
        return "fish";
    }

    @Override
    public String toString(){
        return "Animal: cat\nVoice: " + voice() +
                "\nFood: " + feed() + "\n";
    }
}
