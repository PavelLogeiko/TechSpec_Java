package ru.geekbrains.lesson3;

import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        System.out.println("\nРАБОЧИЕ:\n");
        List<Employee> employeesWorker = Worker.getEmployees(5);

        for (Employee employee: employeesWorker) {
            System.out.println(employee);
        }

        Collections.sort(employeesWorker, new EmployeeNameComparator());
        System.out.println();

        for (Employee employee: employeesWorker) {
            System.out.println(employee);
        }

        System.out.println("\nФРИЛАНСЕРЫ:");
        List<Employee> employeesFreelancer = Freelancer.getEmployees(5);

        for (Employee employee: employeesFreelancer) {
            System.out.println(employee);
        }

        Collections.sort(employeesFreelancer, new EmployeeNameComparator());
        System.out.println();

        for (Employee employee: employeesFreelancer) {
            System.out.println(employee);
        }
    }
}
