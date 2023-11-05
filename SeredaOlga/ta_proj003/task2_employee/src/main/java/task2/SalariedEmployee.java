package task2;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int workingHours;

    public SalariedEmployee(String employeeId, String socialSecurityNumber,
                            String name, int hourlyRate, int workingHours){
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public String getEmployeeId(){
        return employeeId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int calculatePay() {
        return hourlyRate*workingHours;
    }

    @Override
    public String toString(){
        return "\nID: " + employeeId +
                "\nName: " + name +
                "\nSalary: " + calculatePay();
    }
}
