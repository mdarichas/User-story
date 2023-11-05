package task2;

public class Employee implements Salary{
    protected String employeeId;
    protected String name;

    @Override
    public int calculatePay() {
        return 15;
    }
}
