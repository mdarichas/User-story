package task3;

import java.util.*;

public class Student {
    private String name;
    private int course;
    private static final int MIN_COURSE = 1;
    private static final int MAX_COURSE = 10;

    public Student(){}

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    public static List<Student> getStudentsByCourse(List<Student> students, int course){
        List<Student> studentsByCourse = new ArrayList<>();
        if((course < MIN_COURSE) || (course > MAX_COURSE)){
            throw new IllegalArgumentException("The course value must be from 1 to 10 only\n");
        }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student current = iterator.next();
            if (current.getCourse().equals(course)){
                studentsByCourse.add(current);
            }
        }
        return studentsByCourse;
    }

    public static String getStudentsStr (List<Student> students){
        StringBuilder sb = new StringBuilder();
        for (Student student : students){
            sb.append(student.name).append(", ").
               append(student.course).append("\n");
        }
        return "" + sb;
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

    @Override
    public String toString(){
        return name + ", " + course;
    }

}
