class Singleton {
private static Singleton instance;

public static Singleton getInstance()
{  if (instance == null) {
        instance = new Singleton();
    }
        return instance;
}
public void display()
{
    System.out.println("hello from class singleton");
}
}
public class Singleton_Design {
    public static void main(String [] args)
    {
        Singleton sd = Singleton.getInstance();
        Singleton sd1 = Singleton.getInstance();
        if(sd==sd1)
        {
            System.out.println("true");
        }
    }
}
