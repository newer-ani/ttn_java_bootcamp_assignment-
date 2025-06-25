import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String designation;
        int salary=0;
        HashMap<Employee, Integer> map = new HashMap<>();
        while(true) {
            System.out.println("enter name,age,designation,salary of employee");
            name=sc.nextLine();
            age = sc.nextInt();
            sc.nextLine(); //to consume new line created by nextInt();
            designation = sc.nextLine();
            salary = sc.nextInt();
            sc.nextLine();
            map.put(new Employee(name,age,designation), salary);
            System.out.println("do you want to enter more employees(enter the quit to exit)");
            String a = sc.nextLine();
            if(a.equals("quit"))
                break;
        }
        System.out.println("value of hashmap are : ");
        for(Map.Entry<Employee,Integer> entry: map.entrySet())
        {
            System.out.println("key : "+entry.getKey()+" value: "+entry.getValue());
        }
    }
}

class Employee{
    String name;
    int age;
    String designation;


    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}
