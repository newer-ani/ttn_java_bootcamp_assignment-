package createandaccessinterface;

public class DefaultAndStatic implements TestInterface{

    public static void main(String[] args) {

        DefaultAndStatic obj = new DefaultAndStatic();
        obj.show();
        TestInterface.display();

    }
}
