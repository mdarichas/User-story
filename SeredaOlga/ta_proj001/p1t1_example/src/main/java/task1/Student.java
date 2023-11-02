package task1;

import java.text.DecimalFormat;

public class Student {
    private String name;
    private float rating;
    private static float avgRating = -2.0f;


    public Student(){}
    public Student(String name, float rating){
        this.name = name;
        this.rating = rating;
    }

    public void betterStudent (Student... students){
        int amount = students.length;
        if (amount==0){
            avgRating = -1;
            System.out.println("No information about average rating of all students 'cuz no students.");
        }
        else if (amount==1){
            avgRating = students[0].getRating();
            System.out.println("There is only one student, so this student is the best!\n" +
                    "Name: " + students[0].getName() + "\nRating: " + avgRating);
        }
        else {
            float sum = 0;
            for (Student student : students){
                sum += student.getRating();
            }
            avgRating = sum/amount;
            String nameOfBest = "";
            String nameOfCurrent = "";
            boolean theBest = false;
            float maxRating = students[0].getRating();
            for (Student student : students){
                if(student.getRating() > maxRating){
                    maxRating = student.getRating();
                    nameOfBest = student.getName();
                    if (this.rating == maxRating) {theBest = true;}
                    else {
                        theBest = false;
                        nameOfCurrent = this.name;
                    }
                }
            }
            if (theBest) {System.out.println(nameOfBest + " is the best student!\nRating: " + maxRating + "\n");}
            else {System.out.println(nameOfCurrent + " is not the best student!\n" +
                    "The best student is " + nameOfBest + "!\nRating: " + maxRating+ "\n");}
        }
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        String avgRatingStr = df.format(avgRating);
        String avrRatingStr = "\nAverage rating of all students: ";
        if (avgRating==-1){avrRatingStr += "[no students]";}
        else if (avgRating==-2){avrRatingStr += "[to see average rating first execute " +
                "the 'betterStudent()' method]";}
        else {avrRatingStr += avgRatingStr;}

        return "Name: " + name + "\nRating: " + rating + avrRatingStr + "\n";
    }
}