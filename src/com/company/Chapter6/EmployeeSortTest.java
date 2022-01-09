package com.company.Chapter6;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 25000);
        staff[1] = new Employee("Tommy Tocker", 75000);
        staff[2] = new Employee("Carl Clacker", 50000);

        Arrays.sort(staff);

        for (Employee e:staff)
            System.out.println("Name:" + e.getName() + ", salary: " + e.getSalary());
    }
}
