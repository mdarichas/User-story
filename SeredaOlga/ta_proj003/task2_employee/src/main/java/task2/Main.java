package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new SalariedEmployee("0001", "sc0001",
                                            "Marko", 95, 40);
        employees.add(emp1);

        Employee emp2 = new ContractEmployee("0002", "ft0001",
                                        "Klara", 600);
        employees.add(emp2);

        Employee emp3 = new SalariedEmployee("0003", "sc0002",
                                        "John", 70, 40);
        employees.add(emp3);

        Employee emp4 = new ContractEmployee("0004", "ft0002",
                                            "Dean", 740);
        employees.add(emp4);

        Employee emp5 = new ContractEmployee("0005", "ft0003",
                                            "Anna", 380);
        employees.add(emp5);

        Employee emp6 = new SalariedEmployee("0006", "sc0003",
                                            "Lee", 75, 33);
        employees.add(emp6);

        Collections.sort(employees, new EmployeeComparator());

        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}