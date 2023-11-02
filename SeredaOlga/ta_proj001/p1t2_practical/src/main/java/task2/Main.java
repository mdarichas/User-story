package task2;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ben", 100, 10);
        Employee employee2 = new Employee("Mark", 20, 20);

        System.out.println(employee1);
        System.out.println(employee2);

        employee2.setRate(40);
        System.out.println(employee2);

        Employee employee3 = new Employee("Nino", 500);
        System.out.println(employee3);

        employee3.setHours(2);
        System.out.println(employee3);

    }
}

