package com.company.Chapter5;

public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];
        people[0] = new Employee("Carl Hacker", 86000, 1989, 6,8);
        people[1] = new Student("Liza Warren", "computer science");

        for (Person p:people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
