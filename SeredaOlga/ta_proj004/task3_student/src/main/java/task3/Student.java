package task3;

import java.util.*;

public class Student {
    private static List<Student> students = new ArrayList<>();
    private String name;
    private Integer course;

    public Student(){}

    public Student(String name, Integer course){
        Student student = new Student();
        student.setName(name);
        student.setCourse(course);
        addStudent(student);
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public static List<Student> getStudentsList(){
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

}
