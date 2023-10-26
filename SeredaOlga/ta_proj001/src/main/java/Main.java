import example.Student;
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

        Employee employee1 = new Employee("Ben", 70, 40);
        Employee employee2 = new Employee("Mark", 130, 75.5f);
        Employee employee3 = new Employee("Jenny", 80, 32);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}