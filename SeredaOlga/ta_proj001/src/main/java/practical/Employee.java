package practical;

import java.text.DecimalFormat;

public class Employee {
    private String name;
    private float rate;
    private float hours;
    private static float totalSum = 0.0f;

    public Employee(){}
    public Employee(String name, float rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, float rate, float hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary()+getBonuses();
    }

    private float getSalary(){
        return rate*hours;
    }
    private float getBonuses(){
        return getSalary()/10;
    }
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        String salaryStr = df.format(getSalary());
        String bonusStr = df.format(getBonuses());
        return "Information about employee:\nName - " + name + "\nRate - " +
                rate + "\nHours - " + hours + "\nSalary - " + salaryStr + "\nBonuses - "
                + bonusStr + "\nTotal salary of all workers: " + totalSum + "\n";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHours() {
        return hours;
    }
    public void setHours(float hours) {
        this.hours = hours;
    }
}
