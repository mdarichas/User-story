package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintStudent {
    List<Student> students;
    private Integer courseToPrint;

    public PrintStudent (List<Student> students){
        this.students = students;
    }

    public String getStudents(){
        StringBuilder sb = new StringBuilder();
        if(courseToPrint != null){
            List<String> studentsByCourse = new ArrayList<>();
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()){
                Student current = iterator.next();
                if (current.getCourse().equals(courseToPrint)){
                    studentsByCourse.add(current.getName());
                }
            }

            sb.append("course ").append(courseToPrint).append(":\n");
            for (String student : studentsByCourse){
                sb.append(student).append("\n");
            }
        }
        else {
            sb.append("Please choose the course.\n");
        }

        return sb.toString();
    }

    public  void setCourseToPrint(Integer courseToPrint) {
        this.courseToPrint = courseToPrint;
    }

    @Override
    public String toString(){
        return getStudents();
    }
}
