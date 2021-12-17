package com.company.Chapter4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Steve Jobs", 75000, 1987, 12,16);
        staff[1] = new Employee("John Coffee", 50000, 1992, 2,9);
        staff[2] = new Employee("Steve Jobs", 68000, 1989, 7,1);

        for (Employee e:staff) {
            e.raiseSalary(5);
        }

        for (Employee e:staff){
            System.out.println("Name: " + e.getName() + "("+ e.getNextId() + ")" + ", salary: " + e.getSalary() + ", hireday: " + e.getHireDay());
        }

    }
}
