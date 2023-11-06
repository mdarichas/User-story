package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Hermione", 2);
        Student student2 = new Student("Harry", 2);
        Student student3 = new Student("Ron", 2);
        Student student4 = new Student("Cedric", 4);
        Student student5 = new Student("Ginny", 1);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        student1.printStudents(students, 4);
        student1.printStudents(students, 3);
        student1.printStudents(students, 2);
        student1.printStudents(students, 1);

        System.out.println("\nSorted by name:");
        Collections.sort(students, new NameComparator());
        for (Student student : students){
            System.out.println(student.getName());
        }

        System.out.println("\nSorted by course:");
        Collections.sort(students, new CourseComparator());
        for (Student student : students){
            System.out.println(student.getName() + ", "
                    + student.getCourse());
        }
    }
}

