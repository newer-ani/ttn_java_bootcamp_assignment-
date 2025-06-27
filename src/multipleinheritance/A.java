package multipleinheritance;

public interface A {
    default void show()
    {
        System.out.println("think like a monk ");
    }

    static void display()
    {
        System.out.println("inside the display method of interface A ");
    }
}
