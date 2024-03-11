package Yrok_01_12_23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.name = "Home print";
        company.employees = new Employee[4];

        Employee employee1 = new Employee();
        employee1.name = "Adam";
        employee1.age = 17;

        Employee employee2 = new Employee();
        employee2.name = "Dima";
        employee2.age = 25;

        Employee employee3 = new Employee();
        employee3.name = "Alua";
        employee3.age = 30;

        Employee employee4 = new Employee();
        employee4.name = "Kolya";
        employee4.age = 27;

        company.hire(employee1);
        company.hire(employee2);

        company.employees[3] = new Employee();
        company.employees[3].name = "Artur";

        System.out.println(Arrays.toString(company.employees));

        company.fire("Arman");

        System.out.println(Arrays.toString(company.employees));


        employee1.display();

    }
}
