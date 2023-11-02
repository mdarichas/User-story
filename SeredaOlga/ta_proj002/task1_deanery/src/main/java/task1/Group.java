package task1;

public class Group {
    private String number;
    private int creationYear;

    public Group(){}
    public Group(String number, Integer creationYear){
        this.number = number;
        this.creationYear = creationYear;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(Integer creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public String toString(){
        return "\nGroup: " + number +
                "\nYear of creation: " + creationYear + "\n";
    }
}

