package com.company.Chapter6;

import java.util.Date;

public class EmployeeClone implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public EmployeeClone(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public EmployeeClone clone() throws CloneNotSupportedException {
        EmployeeClone cloned = (EmployeeClone) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }
}
