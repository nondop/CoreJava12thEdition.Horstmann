package com.company.Chapter5;

public class ManagerTest {
    public static void main(String[] args) {
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 55000, 1986, 8,2);


        for (Employee e:staff)
            System.out.println("Name: " + e.getName() + ", salary: " + e.getSalary());
    }

}
