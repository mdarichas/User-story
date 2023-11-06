package task3;

import java.util.*;

public class Student {
    private String name;
    private Integer course;

    public Student(String name, Integer course){
        this.name = name;
        this.course = course;
    }

    public void printStudents(List<Student> students, Integer course){
        List<String> studentsByCourse = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student current = iterator.next();
            if (current.getCourse().equals(course)){
                studentsByCourse.add(current.getName());
            }
        }
        System.out.println("\ncourse " + course + ":");
        for (String student : studentsByCourse){
            System.out.println(student);
        }
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
