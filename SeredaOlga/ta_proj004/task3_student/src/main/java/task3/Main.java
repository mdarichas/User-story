package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student st1 = new Student("Hermione", 2);
        students.add(st1);

        Student st2 =new Student("Harry", 2);
        students.add(st2);

        Student st3 =new Student("Ron", 2);
        students.add(st3);

        Student st4 =new Student("Cedric", 4);
        students.add(st4);

        Student st5 =new Student("Ginny", 1);
        students.add(st5);

        int myCourse = 2;
        List<Student> studentsC2 = Student.getStudentsByCourse(students, myCourse);
        System.out.println("\nCourse " + myCourse + ":");
        System.out.println(Student.getStudentsStr(studentsC2));

        myCourse = 4;
        List<Student> studentsC4 = Student.getStudentsByCourse(students, myCourse);
        System.out.println("Course " + myCourse + ":");
        System.out.println(Student.getStudentsStr(studentsC4));

        System.out.println("Sorted by name:");
        Collections.sort(students, new NameComparator());
        System.out.println(Student.getStudentsStr(students));

        System.out.println("Sorted by course:");
        Collections.sort(students, new CourseComparator());
        System.out.println(Student.getStudentsStr(students));

    }
}

