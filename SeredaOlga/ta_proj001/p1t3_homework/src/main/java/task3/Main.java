package task3;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Jim");
        person1.setBirthYear(1997);
        System.out.println(person1);

        Person person2 = new Person("Greg", 2001);
        System.out.println(person2);

        person1.setName("Jimmy");
        System.out.println(person1);

        Person person3 = new Person("Sara", 1983);
        System.out.println(person3);
        Person person4 = new Person("William", 2009);
        System.out.println(person4);
        Person person5 = new Person("Matilda", 1964);
        System.out.println(person5);

    }
}