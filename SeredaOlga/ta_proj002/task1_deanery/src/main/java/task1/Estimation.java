package task1;

import task1.enums.DiffResult;

import java.time.LocalDate;

public class Estimation {
    private DiffResult passed = DiffResult.DEF;
    private Integer mark;
    private LocalDate actualDate;
    private Discipline discipline;
     public Estimation (Discipline discipline,
                        Integer mark, LocalDate actualDate){
         this.discipline = discipline;
         this.mark = mark;
         this.actualDate = actualDate;
     }
    public Estimation (Discipline discipline,
                       DiffResult passed, LocalDate actualDate){
        this.discipline = discipline;
        this.passed = passed;
        this.actualDate = actualDate;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getMark() {
        return mark;
    }

    public void setPassed(DiffResult passed) {
        this.passed = passed;
    }
    public String getPassed(){
         String passedStr = "";
        if(passed == DiffResult.PASSED){
            passedStr = "passed";
        }
        else if (passed == DiffResult.NOT_PASSED) {
            passedStr =  "did not pass";
        }
        else {
            passedStr = "no rating";
        }
         return passedStr;
    }

    public void setActualDate(LocalDate actualDate) {
        this.actualDate = actualDate;
    }

    public LocalDate getActualDate() {
        return actualDate;
    }


    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Discipline getDiscipline() {
        return discipline;
    }
}
