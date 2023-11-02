package task1;

import task1.enums.EstimationType;

import java.time.LocalDate;

public class Discipline {
    private String name;
    private LocalDate date;
    private EstimationType estType = EstimationType.DEF;

    public Discipline(){}
    public Discipline(String name, LocalDate date, EstimationType estType){
        this.name = name;
        this.date = date;
        this.estType = estType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setEstType(EstimationType estType) {
        this.estType = estType;
    }

    public EstimationType getEstType() {
        return estType;
    }

    public String toString(){
        String type = "";
        if (estType == EstimationType.DIFF){
            type = "offset";
        }
        else if (estType == EstimationType.EXAM){
            type = "exam";
        }
        else {
            type = "not yet determined";
        }
        return "\nName: " + name + "\nDate: " + date +
                "\nEstimation type: " + type;
    }

}
