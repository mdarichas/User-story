package task1;

public class Swallow extends FlyingBird {
    private final String NAME = "swallow";

    public Swallow (){
        feathers = true;
        layEggs = true;
    }

    @Override
    public String toString(){
        String feathersStr = "";
        String eggsStr = "";
        if (feathers){
            feathersStr = "The bird has feathers.";
        }
        else {
            feathersStr = "The bird has not feathers.";
        }

        if (layEggs){
            eggsStr = "The bird lays eggs.";
        }
        else {
            eggsStr = "The bird does not lays eggs.";
        }

        return "\nBird: " + NAME +
                "\n" + feathersStr +
                "\n" + eggsStr +
                "\n" + fly() + "\n";
    }
}
