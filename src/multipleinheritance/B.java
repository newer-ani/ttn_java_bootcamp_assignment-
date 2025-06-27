package multipleinheritance;

public interface B {
    default void show()
    {
        System.out.println("hard work is the key to success");
    }

    static void display()
    {
        System.out.println("inside the display method of interface B");
    }
}
