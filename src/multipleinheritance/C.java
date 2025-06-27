package multipleinheritance;

public interface C extends A,B{

    default void show()
    {
        A.super.show();
    }

}
