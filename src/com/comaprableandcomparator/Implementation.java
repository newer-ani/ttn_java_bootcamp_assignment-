package com.comaprableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Implementation {
   public static void main(String [] args)
   {
       Scanner sc = new Scanner(System.in);
       List<Employee> employees  = new ArrayList<>();
       while(true)
       {
           System.out.println("enter name , age and salary of the employee");
           String name = sc.nextLine();
           int age = sc.nextInt();
           int salary = sc.nextInt();
           sc.nextLine();//to consume the newline after the nextInt
           employees.add(new Employee(age,salary,name));
           System.out.println("do you want to enter more employees? (enter quit to exit) ");
           String input = sc.nextLine();
           if(input.equals("quit"))
               break;
       }
       Collections.sort(employees);
       System.out.println("list of employees sorted by firstname and lastname are :  ");
       System.out.println(employees.toString());
       System.out.println("list of employees sorted by age are:  ");
       Collections.sort(employees, new EmployeeComparator());
       System.out.println(employees.toString());
   }
}
