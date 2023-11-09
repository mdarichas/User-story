package task3;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintStudentTest {

    @org.junit.jupiter.api.Test
    void getStudents() {
        new Student("Hermione", 2);
        new Student("Harry", 2);
        new Student("Ginny", 1);

        PrintStudent ps = new PrintStudent(Student.getStudentsList());
        ps.setCourseToPrint(2);

        String expected = "course 2:\n" +
                "Hermione\n" +
                "Harry\n";
        String actual = ps.getStudents();

        assertEquals(expected, actual);
    }
}