import example.Student;

public class Main {
    public static void main(String... args){
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
    }
}