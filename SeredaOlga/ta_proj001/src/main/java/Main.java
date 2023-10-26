import example.Student;
import homework.Person;
import practical.Employee;

public class Main {
    public static void main(String... args){

        System.out.println("\ndisplaying results of task 'Example'\n");

        Student student1 = new Student();
        student1.setName("Alexa");
        student1.setRating(3.5f);
        Student student2 = new Student("Max", 4.1f);
        Student student3 = new Student("Alli", 2.7f);

        student1.betterStudent(student1, student2, student3);
        student2.betterStudent(student1, student2, student3);
        student3.betterStudent(student1, student2, student3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        System.out.println("\ndisplaying results of task 'Practical'\n");

        Employee employee1 = new Employee("Ben", 100, 10);
        Employee employee2 = new Employee("Mark", 20, 20);

        System.out.println(employee1);
        System.out.println(employee2);

        employee2.setRate(40);
        System.out.println(employee2);

        Employee employee3 = new Employee("Nino", 500);
        System.out.println(employee3);

        employee3.setHours(2);
        System.out.println(employee3);

        System.out.println("\ndisplaying results of task 'Homework'\n");

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