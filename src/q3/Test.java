package q3;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Shantanu  Aggarwal", 10);
        Student student2 = new Student(2, "Shantanu Aggarwal", 12);

        System.out.println(student1);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
