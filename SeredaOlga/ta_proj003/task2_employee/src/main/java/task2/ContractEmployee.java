package task2;

public class ContractEmployee extends Employee {

    private String federalTaxIdMember;
    private int monthlyPay;
    public ContractEmployee(String employeeId, String federalTaxIdMember,
                            String name, int monthlyPay){
        this.employeeId = employeeId;
        this.federalTaxIdMember = federalTaxIdMember;
        this.name = name;
        this.monthlyPay = monthlyPay;
    }


    public void setMonthlyPay(int monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public int getMonthlyPay() {
        return monthlyPay;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
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
        return monthlyPay;
    }

    @Override
    public String toString(){
        return "\nID: " + employeeId +
                "\nName: " + name +
                "\nSalary: " + calculatePay();
    }
}
