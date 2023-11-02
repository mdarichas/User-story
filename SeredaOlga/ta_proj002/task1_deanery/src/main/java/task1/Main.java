package task1;

import task1.enums.DiffResult;
import task1.enums.EstimationType;
import task1.enums.InfoType;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Greg", "Pris", "0001");

        System.out.println(st1);

        st1.setInfo(InfoType.ALL);
        System.out.println(st1);

        st1.setFirstName("Alan");
        System.out.println(st1);

        Group group1 = new Group("CS413B", 2020);

        st1.setGroup(group1);
        st1.setInfo(InfoType.GROUP);
        System.out.println(st1);

        st1.setInfo(InfoType.ALL);
        System.out.println(st1);

        System.out.print(st1.getGroup());

        Group group2 = new Group("KS215B", 2022);

        Student st2 = new Student("Alla", "Pinchuk", "0002", group2);
        st2.setInfo(InfoType.ALL);
        System.out.println(st2);

        Student st3 = new Student("Mark", "Pollo", "0003", group2);
        st3.setInfo(InfoType.ALL);
        System.out.println(st3);

        group2.setNumber("NS215B");
        System.out.print(st2);
        System.out.print(st3);

        Student st4  = new Student("Anna", "Marie", "0004", group1);
        st4.setInfo(InfoType.ALL);
        System.out.print(st4);

        Discipline dis1 = new Discipline("Math", null, EstimationType.EXAM);
        Estimation dis1st4 = new Estimation(dis1, -1, null);

        st4.addDiscipline(dis1st4);

        Discipline dis2 = new Discipline("English", null, EstimationType.DIFF);
        Estimation dis2st4 = new Estimation(dis2, DiffResult.DEF, null);

        st4.addDiscipline(dis2st4);
        st4.setInfo(InfoType.PROGRESS);
        System.out.print(st4);

        Estimation dis1st1 = new Estimation(dis1, 60, null);
        Estimation dis2st1 = new Estimation(dis2, DiffResult.PASSED, null);


        st2.addDiscipline(dis1st1);
        st2.addDiscipline(dis2st1);
        st2.setInfo(InfoType.PROGRESS);

        System.out.print(st2);



    }
}