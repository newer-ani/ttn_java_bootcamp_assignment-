package createandaccessinterface;

public interface TestInterface {

    default void show()
    {
        System.out.println("show from default method");
    }

    static void display()
    {
        System.out.println("display from static method");
    }

}
