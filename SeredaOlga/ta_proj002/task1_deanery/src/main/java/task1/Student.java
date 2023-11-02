package task1;

import task1.enums.EstimationType;
import task1.enums.InfoType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeBookNum;
    private InfoType info = InfoType.DEF;
    private Group group = new Group();
    private final List<Estimation> disciplines = new ArrayList<>();

    public Student(){}
    public Student(String firstName, String lastName, String gradeBookNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeBookNum = gradeBookNum;
    }
    public Student(String firstName, String lastName, String gradeBookNum, Group group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeBookNum = gradeBookNum;
        this.group = group;
    }

    public void addDiscipline(Estimation estDiscipline) {
        disciplines.add(estDiscipline);
    }

    public void removeDiscipline(Estimation estDiscipline) {
        disciplines.remove(estDiscipline);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGradeBookNum() {
        return gradeBookNum;
    }

    public void setGradeBookNum(String gradeBookNum) {
        this.gradeBookNum = gradeBookNum;
    }

    public void setInfo(InfoType info) {
        this.info = info;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString(){
        String studentDescription = "";
        String groupInfo = "no group yet";
        if (group.getNumber() != null){groupInfo = group.getNumber();}
        switch (info){
            case ALL:{
                studentDescription = "\nFirst Name: " + firstName +
                        "\nLast Name: " + lastName +
                        "\nGrade book number: " + gradeBookNum +
                        "\nGroup: " + groupInfo + "\n";
            }
            break;
            case NAME:{
                studentDescription = "\nFirst Name: " + firstName +
                        "\nLast Name: " + lastName + "\n";
            }
            break;
            case GRADEBOOK:{
                studentDescription = "\nGrade book number: " +
                        gradeBookNum + "\n";
            }
            break;
            case GROUP:{
                studentDescription = "\nGroup: " + groupInfo + "\n";
            }
            break;
            case PROGRESS:{
                StringBuilder result = new StringBuilder();
                Discipline disciplineTemp;
                List<Discipline> disciplinesDiff = new ArrayList<>();
                List<Discipline> disciplinesExam = new ArrayList<>();
                List<String> passedList = new ArrayList<>();
                List<Integer> marks = new ArrayList<>();
                for (Estimation estDiscipline : disciplines){
                    disciplineTemp = estDiscipline.getDiscipline();
                    if(disciplineTemp.getEstType() == EstimationType.DIFF){
                        disciplinesDiff.add(disciplineTemp);
                        passedList.add(estDiscipline.getPassed());
                    }
                    else if(disciplineTemp.getEstType()== EstimationType.EXAM){
                        disciplinesExam.add(disciplineTemp);
                        marks.add(estDiscipline.getMark());
                    }
                }

                for(int i = 0; i < disciplinesDiff.size(); i++){
                    result.append("\n" + disciplinesDiff.get(i).getName() +
                            ", " + passedList.get(i));
                }

                for(int i = 0; i < disciplinesExam.size(); i++){
                    String markStr = "no rating";
                    if(marks.get(i) < 0){
                        markStr = "no rating";
                    }
                    else {
                        markStr = "" + marks.get(i);
                    }
                    result.append("\n" + disciplinesExam.get(i).getName() +
                            ", " + markStr);
                }
                studentDescription = result.toString();
            }
            break;
            default:{
                studentDescription = "\n(def) \nFirst Name: " + firstName +
                "\nLast Name: " + lastName + "\n";
            }
            break;
        }
        return  studentDescription;
    }
}
