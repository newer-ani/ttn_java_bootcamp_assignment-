package Pacakge;

// Q4 Write a program to implement constructor reference

@FunctionalInterface
interface StudentFactory {
    Student create(String name, int age);
}


public class ConstructorReference {

    public static void main(String[] args) {

        StudentFactory factory = Student::new;

        Student student1 = factory.create("Animesh",22);
        Student student2 = factory.create("Rashi",23);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}


class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
