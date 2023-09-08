package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee{

        private Freelancer (String surName, String name, double salary){
            super(surName, name, salary);
        }

        public static Employee getInstance(){
            return new Freelancer(
                    surNames[random.nextInt(surNames.length)],
                    names[random.nextInt(surNames.length)],
                    random.nextInt(1000, 3000));
        }

        public static List<Employee> getEmployees(int count){
            List<Employee> employees = new ArrayList<>();
            for (int i = 0; i < count; i++)
                employees.add(getInstance());
            return employees;
        }

        @Override
        public double calculateSalary() {
            return salary* (20.8*8);
        }

        @Override
        public String toString() {
            return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                    surName, name, salary* (20.8*8));
        }
    }
