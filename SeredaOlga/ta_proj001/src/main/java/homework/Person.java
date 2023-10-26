package homework;

import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;

    public Person(){}
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age(){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - birthYear;
    }

    @Override
    public String toString(){
        return "\nInformation about person:\nName - " + name + "\nBirthday year - " + birthYear +
                "\nCurrent age - " + age();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
