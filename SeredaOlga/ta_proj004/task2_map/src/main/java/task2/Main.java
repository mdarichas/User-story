package task2;

public class Main {
    public static void main(String[] args) {

        MapProcessing mp = new MapProcessing();

        mp.fillMapDefault();
        System.out.println("\n-- Before removing --");
        System.out.println(mp);

        mp.removeByName("Bran");
        System.out.println("\n-- After removing --");
        System.out.println(mp);
    }
}
