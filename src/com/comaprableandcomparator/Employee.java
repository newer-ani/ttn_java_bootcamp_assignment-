package com.comaprableandcomparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    double age;
    double salary;
    String name;

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String getFirstName()
    {
        String [] words = name.split(" ");
        return words[0];
    }

    public String getLastName()
    {
        String [] words = name.split(" ");
        return words[words.length-1];
    }
    @Override
    public int compareTo(Employee o) {
        int firstcomp = this.getFirstName().compareTo(o.getFirstName());
        if(firstcomp!=0)
            return firstcomp;
        return this.getLastName().compareTo(o.getLastName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.age - o2.age);
    }
}
