package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        new Student("Hermione", 2);
        new Student("Harry", 2);
        new Student("Ron", 2);
        new Student("Cedric", 4);
        new Student("Ginny", 1);

        PrintStudent ps = new PrintStudent(Student.getStudentsList());
        ps.setCourseToPrint(4);
        System.out.println(ps);
        ps.setCourseToPrint(3);
        System.out.println(ps);
        ps.setCourseToPrint(2);
        System.out.println(ps);
        ps.setCourseToPrint(1);
        System.out.println(ps);

        System.out.println("Sorted by name:");
        Collections.sort(Student.getStudentsList(), new NameComparator());
        for (Student student : Student.getStudentsList()){
            System.out.println(student.getName());
        }

        System.out.println("\nSorted by course:");
        Collections.sort(Student.getStudentsList(), new CourseComparator());
        for (Student student : Student.getStudentsList()){
            System.out.println(student.getName() + ", "
                    + student.getCourse());
        }

    }
}

