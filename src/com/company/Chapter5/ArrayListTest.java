package com.company.Chapter5;

import com.company.Chapter5.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 16));
        staff.add(new Employee("Harry Hacker", 75000, 1989, 6, 1));
        staff.add(new Employee("Tony Tester", 75000, 1982, 2, 6));

        for(Employee e: staff)
            e.raiseSalary(5);

        for (Employee e: staff)
            System.out.println("Name: " + e.getName() + ", salary: " + e.getSalary());

    }
}
