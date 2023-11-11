package task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getStudentsByCourse() {
        List<Student> students = new ArrayList<>();

        Student st1 = new Student("Hermione", 2);
        students.add(st1);
        Student st2 =new Student("Harry", 2);
        students.add(st2);
        Student st3 =new Student("Cedric", 4);
        students.add(st3);
        Student st4 =new Student("Ginny", 1);
        students.add(st4);

        List<Student> expected = new ArrayList<>();
        expected.add(st1);
        expected.add(st2);

        List<Student> actual = Student.getStudentsByCourse(students, 2);

        assertEquals(expected, actual);
    }

    @Test
    void getStudentsStr() {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Hermione", 2);
        students.add(st1);
        Student st2 =new Student("Harry", 2);
        students.add(st2);
        Student st3 =new Student("Ron", 2);
        students.add(st3);

        String expected = "Hermione, 2\n" +
                          "Harry, 2\n" +
                          "Ron, 2\n";
        String actual = Student.getStudentsStr(students);

        assertEquals(expected, actual);
    }
}